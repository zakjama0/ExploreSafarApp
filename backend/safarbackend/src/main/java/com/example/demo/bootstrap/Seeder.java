package com.example.demo.bootstrap;

import com.example.demo.enums.RoleEnum;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

@Component
public class Seeder implements ApplicationListener<ContextRefreshedEvent> {

    public final UserRepository userRepository;
    public final RoleRepository roleRepository;
    public final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Seeder(
            UserRepository userRepository,
            RoleRepository roleRepository,
            BCryptPasswordEncoder bCryptPasswordEncoder
    ) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.loadData();
    }

    public void loadData() {
        this.loadRoles();
        this.createSuperAdministrator();
    }

    private void loadRoles() {
        RoleEnum[] roleNames = new RoleEnum[] { RoleEnum.USER, RoleEnum.ADMIN, RoleEnum.SUPER_ADMIN};
        Map<RoleEnum, String> roleDescriptionMap = Map.of(
                RoleEnum.USER, "Default user role",
                RoleEnum.ADMIN, "Administrator role",
                RoleEnum.SUPER_ADMIN, "Super Administrator role"
        );

        Arrays.stream(roleNames).forEach((roleName) -> {
            Optional<Role> optionalRole = roleRepository.findByName(roleName);

            optionalRole.ifPresentOrElse(System.out::println, () -> {
                Role roleToCreate = new Role();

                roleToCreate.setName(roleName);
                roleToCreate.setDescription(roleDescriptionMap.get(roleName));

                roleRepository.save(roleToCreate);
            });
        });
    }

    private void createSuperAdministrator() {

        Optional<Role> optionalRole = roleRepository.findByName(RoleEnum.SUPER_ADMIN);

        if(optionalRole.isEmpty()) {
            return;
        }

        User user = new User(
                "Tadiwanashe Dzvoti",
                "tadiwa@exploesafar.com",
                bCryptPasswordEncoder.encode("password"),
                optionalRole.get()
        );

        userRepository.save(user);
    }
}
