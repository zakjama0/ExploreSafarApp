import React from 'react'
import { useEffect, useState } from 'react';
import CountryList from '../components/CountryList';
import PropTypes from 'prop-types';
import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import { styled } from '@mui/material/styles';
import { TextField } from '@mui/material';
import DuaCard from '../components/DuaCard';


const travelDuas = [
        {
          name: "Starting the journey",
          arabic:"بِسْمِ اللَّهِ تَوَكَّلْتُ عَلَى اللَّهِ لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللَّه",
          translation:"In the name of Allah, I trust in Allah; there is no might and no power but in Allah",
          transliteration:"Bismillahi tawakkaltu alallahi la hawla wala quwwata illa billah",
          explanation:" For the following verse, Anas bin Malik (RA) narrates that Prophet Muhammad (PBUH) said that: “Whoever says upon leaving his house (recites the below-mentioned verses) it will be said to him: ‘You are guided, defended and protected.’ The devil will go far away from him. ",
          source:"Grade: Sahih (Al-Albani), Reference: Sunan Abi Dawud 5095, In-book reference: Book 43, Hadith 323 ",
          category:"Travel Dua" 
        }, 
        {
            name: "Seeking refuge with Allah from the hardships of travelling",
            arabic:"اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنْ وَعْثَاءِ السَّفَرِ وَكَآبَةِ الْمُنْقَلَبِ وَالْحَوْرِ بَعْدَ الْكَوْرِ وَدَعْوَةِ الْمَظْلُومِ وَسُوءِ الْمَنْظَرِ فِي الأَهْلِ وَالْمَالِ",
            translation:" O Allah, I seek refuge with You from the hardships of travel and the sorrows of return, from loss after plenty, from the supplication of the one who has been wronged, and seeing some calamity befall my family or wealth. ",
            transliteration:"Allahumma inni a'udhu bika min wa'tha'is-safari, wa kabatil-munqalabi, wal-hawri ba'dal-kawri, wa da'watil-mazlumi, wa suw'il-munzari fil-ahli wal-mal",
            explanation:"It was narrated that 'Abdullah bin Sarjis said: When the Prophet [SAW] traveled, he would seek refuge with Allah from the hardships of travel, and the sorrows of return, from loss after plenty, from the supplication of the one who has been wronged, and from seeing some calamity befall.  ",
            source:"Grade: Sahih (Darussalam) Reference	 : Sunan an-Nasa'i 5500 In-book Reference: Book 50, Hadith 73",
            category:"Travel Dua" 
        },
        {
            name: "Supplication at the time of Riding",
            arabic:" سبحان الذي سخر لنا هذا وما كنا له مقرنين، وإنا إلي ربنا لمنقلبون. اللهم إنا نسألك في سفرنا هذا البر والتقوى، ومن العمل ما ترضي اللهم هون علينا سفرنا هذا واطو عنا بعده اللهم أنت الصاحب في السفر والخليفة في الأهل. اللهم إني أعوذ بك من وعثاء السفر وكآبة المنظر وسوء المنقلب في الأهل والمال والولد وإذا رجع قالهن وزاد فيهن آيبون تائبون عابدون لربنا حامدون ",
            translation:"Far removed from imperfection is the One Who has made this subservient to us, for we have no power to subjugate it, and certainly to our Rubb shall we return. O Allah, we ask You during this journey of ours for righteousness, piety and such deeds as are pleasing to You. O Allah, make easy for us this journey of ours and make the distance short for us. O Allah, You are our Companion during the journey and the Guardian of the family and the property in our absence. O Allah, I seek refuge in You from the hardships of travelling, unhappiness connected with ghastly scenes and evil turns in property and family)",
            transliteration:"Subhanal-ladhi sakh-khara lana hadha, wa ma kunna lahu muqrinin, wa inna ila Rabbina lamunqalibun. Allahumma inna nas'aluka fi safarina hadh al-birra wat-taqwa, wa minal-'amali ma tarda. Allahumma hawwin 'alaina safarana hadha, watwi 'anna bu'dahu. Allahumma Antas-Sahibu fissafari, wal-Khalifatu fil- ahli. Allahumma inni a'udhu bika min wa'ta'is-safari, wa kaabatil- manzari, wa su'il-munqalabi fil-mali wal-ahli wal-waladi ",
            explanation:"This hadith is about the importance of supplicating to Allah before and after travelling. Before setting out on a journey, the Prophet Muhammad would recite Allahu Akbar three times followed by a supplication asking Allah for righteousness, piety and such deeds as are pleasing to Him. He also asked Allah to make the journey easy and short for them. Upon returning from his travels, he would add additional words of praise in his supplication. This hadith teaches us that we should always remember to ask Allah for guidance during our travels so that we may return safely with good deeds done in His pleasure. We should also remember to thank Him upon our return home from our journeys. ",
            source:"Source: Sahih Muslim    Reference: Riyad as-Salihin 972, In-book reference: Book 7, Hadith 17",
            category:"Travel Dua" 
        },
        {
            name: "Supplication on Alighting at a Halt",
            arabic:"  أعوذ بكلمات الله التامات من شر ما خلق لم يضره شيء حتي يرتحل من منزله ذلك",
            translation:"I seek refuge with the Perfect Words of Allah from the evil of what He has created",
            transliteration:"A'udhu bikalimat-illahit-tammati min sharri ma khalaqa",
            explanation:"I heard the Messenger of Allah (ﷺ) saying, ' Whosoever alights somewhere and says [this dua] nothing will harm him until he leaves that place.'",
            source:"Source: Sahih Muslim\n "+ "Reference\t : Riyad as-Salihin 982\n" +
            "In-book reference\t : Book 7, Hadith 27",
            category:"Travel Dua" 
        },
        
];
const travelEtiquette = [
    {
      name: "Setting a leader",
      arabic:"عن أبي سعيد وأبي هريرة رضي الله عنهما قالا قال رسول الله صلى الله عليه وسلم إذا خرج ثلاثة في سفر فليأمروا أحدهم حديث حسن  ",
      translation:"The Messenger of Allah (ﷺ) said, 'When three persons set out on a journey, they should appoint one of them as their leader.'",
      transliteration:"",
      explanation:"",
      source:"Source: Abu Dawud" +
      "Reference\t : Riyad as-Salihin 960\n" +
      "In-book reference\t : Book 7, Hadith 5\n",
      category:""
    }, 
    {
        name: "Glorification of Allah by a Traveler while Ascending and Descending",
        arabic:"عن جابر رضي الله عنه قال: كنا إذا صعدنا كبرنا، وإذا نزلنا سبحنا",
        translation:"When we ascended (a height) we would proclaim: 'Allahu Akbar (Allah is Greatest), and when we descended (from the height) we would proclaim: Subhan Allah (Allah is free from imperfection).'",
        transliteration:"",
        explanation:"",
        source:"Sahih Al Bukhari, Reference: Riyad as-Salihin 975, In-book reference: Book 7, Hadith 20",
        category:""
      }, 
      {
        name: "Those who have accepted supplication",
        arabic:"عن أبي هريرة رضي الله عنه قال : رسول الله صلى الله عليه وسلم : ثلاث دعوات مستجابات لا شك فيهن: دعوة المظلوم، ودعوة المسافر، ودعوة الوالد على ولده",
        translation:"Abu Hurairah (May Allah be pleased with him) reported:The Messenger of Allah (ﷺ) said, 'Three supplications are answered without doubt. The supplication of the oppressed, the supplication of the traveller, and the supplication of the parent for his son.'",
        transliteration:"",
        explanation:"",
        source:"At-Tirmidhi and Abu Dawud,  Reference: Riyad as-Salihin 980, In-book reference	 : Book 7, Hadith 25",
        category:""
      }, 
    
    
];

const CustomTab = styled((props) => <Tab disableRipple {...props} />)(({ theme }) => ({
    textTransform: 'none',
    minWidth: 0,
    [theme.breakpoints.up('sm')]: {
      minWidth: 0,
    },
    fontWeight: theme.typography.fontWeightRegular,
    marginRight: theme.spacing(1),
    color: 'rgba(0, 0, 0, 0.85)',
    fontFamily: [
      "Montserrat",
      'sans-serif',
    ].join(','),
    '&:hover': {
      color: '#40a9ff',
      opacity: 1,
    },
    '&.Mui-selected': {
      color: '#1890ff',
      fontWeight: theme.typography.fontWeightMedium,
    },
    '&.Mui-focusVisible': {
      backgroundColor: '#d1eaff',
    },
  }));

  function CustomTabPanel(props) {
    const { children, value, index, ...other } = props;
  
    return (
      <div
        role="tabpanel"
        hidden={value !== index}
        id={`simple-tabpanel-${index}`}
        aria-labelledby={`simple-tab-${index}`}
        {...other}
      >
        {value === index && (
          <Box sx={{ p: 3 }}>
            <Typography>{children}</Typography>
          </Box>
        )}
      </div>
    );
  }

  CustomTabPanel.propTypes = {
    children: PropTypes.node,
    index: PropTypes.number.isRequired,
    value: PropTypes.number.isRequired,
  };
  function a11yProps(index) {
    return {
      id: `simple-tab-${index}`,
      'aria-controls': `simple-tabpanel-${index}`,
    };
  }
const DuasContainer = ({duas}) => {
const [value, setValue] = useState(0);
  const [category, setCategory] = useState("TRAVEL_DUA");
  const [searchQuery, setSearchQuery] = useState("");
  const [searchedDuas, setSearchedDuas] = useState([]);

  const filteredDuas = duas.filter(dua => category === dua.categroy);
  const search = (searchQuery => {
    return duas.filter(dua => dua.name.toLowerCase().includes(searchQuery.toLowerCase()));
  });

  useEffect(() => {
    setSearchedDuas(search(searchQuery));
  }, [searchQuery])

  const valueToCategory = {
    0: "TRAVEL_DUA",
    1: "TRAVEL_ETIQUETTE",
  }

  const handleTabChange = (event, newValue) => {
    setValue(newValue);
    setCategory(valueToCategory[newValue]);
  };

  return (
    <div className='bg-[#d2dbd8] min-h-screen h-full pb-40 dark:bg-slate-800 dark:text-white w-full'>
    <div className='flex-row justify-center items-center'>
    <h1 className="py-5  mb-5 text-5xl text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800 ">Duas & Etiquette</h1>
    {/* <h1 className='mb-5 mx-5 md:mx-20 text-lg text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800'> قُلْ سِيرُوا۟ فِى ٱلْأَرْضِ فَٱنظُرُوا۟ كَيْفَ بَدَأَ ٱلْخَلْقَ ۚ ثُمَّ ٱللَّهُ يُنشِئُ ٱلنَّشْأَةَ ٱلْـَٔاخِرَةَ ۚ إِنَّ ٱللَّهَ عَلَىٰ كُلِّ شَىْءٍ قَدِيرٌ </h1> */}
    <h1 className='mb-5 mx-5 md:mx-20 md:text-lg text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800'> Say (O Muhammad): ‘Travel throughout the land and see how He originated the creation, then Allah will bring it into being one more time. Surely Allah is Most Capable of everything.’</h1>
    <h1 className='mb-5 text-lg text-center text-gradient font-bold bg-gradient-to-r from-indigo-400 via-indigo-500 to-violet-800'>(Surah Al-Ankabut, 29:20)</h1>
    <Box sx={{ width: '100%' }}>
      {searchQuery.trim() === "" ?
        <div className='h-full'>
          <Box>
            <Tabs className='mx-auto' sx={{ width: 4 / 5 }} value={value} onChange={handleTabChange} variant='fullWidth' aria-label="basic tabs example">
              <CustomTab label="Duas" {...a11yProps(0)} className='dark:text-white' />
              <CustomTab label="Etiquette" {...a11yProps(1)} className='dark:text-white' />
              
            </Tabs>
          </Box>
          <CustomTabPanel value={value} index={0} >
          <DuaCard duas={travelDuas} />
          </CustomTabPanel>
          <CustomTabPanel value={value} index={1}>
          <DuaCard duas={travelEtiquette}/>
          </CustomTabPanel>
        </div>
        :
        <h2>Test</h2>
      }
    </Box>

    </div>



    </div>
  )
}

export default DuasContainer