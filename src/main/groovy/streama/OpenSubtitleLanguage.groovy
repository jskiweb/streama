package streama

class OpenSubtitleLanguage {
  static List languages = [
    [id: 'aar', label: 'Afar, afar'],
    [id: 'abk', label: 'Abkhazian'],
    [id: 'ace', label: 'Achinese'],
    [id: 'ach', label: 'Acoli'],
    [id: 'ada', label: 'Adangme'],
    [id: 'ady', label: 'adyghé'],
    [id: 'afa', label: 'Afro-Asiatic (Other)'],
    [id: 'afh', label: 'Afrihili'],
    [id: 'afr', label: 'Afrikaans'],
    [id: 'ain', label: 'Ainu'],
    [id: 'aka', label: 'Akan'],
    [id: 'akk', label: 'Akkadian'],
    [id: 'alb', label: 'Albanian'],
    [id: 'ale', label: 'Aleut'],
    [id: 'alg', label: 'Algonquian languages'],
    [id: 'alt', label: 'Southern Altai'],
    [id: 'amh', label: 'Amharic'],
    [id: 'ang', label: 'English, Old (ca.450-1100)'],
    [id: 'apa', label: 'Apache languages'],
    [id: 'ara', label: 'Arabic'],
    [id: 'arc', label: 'Aramaic'],
    [id: 'arg', label: 'Aragonese'],
    [id: 'arm', label: 'Armenian'],
    [id: 'arn', label: 'Araucanian'],
    [id: 'arp', label: 'Arapaho'],
    [id: 'art', label: 'Artificial (Other)'],
    [id: 'arw', label: 'Arawak'],
    [id: 'asm', label: 'Assamese'],
    [id: 'ast', label: 'Asturian'],
    [id: 'ath', label: 'Athapascan languages'],
    [id: 'aus', label: 'Australian languages'],
    [id: 'ava', label: 'Avaric'],
    [id: 'ave', label: 'Avestan'],
    [id: 'awa', label: 'Awadhi'],
    [id: 'aym', label: 'Aymara'],
    [id: 'aze', label: 'Azerbaijani'],
    [id: 'bad', label: 'Banda'],
    [id: 'bai', label: 'Bamileke languages'],
    [id: 'bak', label: 'Bashkir'],
    [id: 'bal', label: 'Baluchi'],
    [id: 'bam', label: 'Bambara'],
    [id: 'ban', label: 'Balinese'],
    [id: 'baq', label: 'Basque'],
    [id: 'bas', label: 'Basa'],
    [id: 'bat', label: 'Baltic (Other)'],
    [id: 'bej', label: 'Beja'],
    [id: 'bel', label: 'Belarusian'],
    [id: 'bem', label: 'Bemba'],
    [id: 'ben', label: 'Bengali'],
    [id: 'ber', label: 'Berber (Other)'],
    [id: 'bho', label: 'Bhojpuri'],
    [id: 'bih', label: 'Bihari'],
    [id: 'bik', label: 'Bikol'],
    [id: 'bin', label: 'Bini'],
    [id: 'bis', label: 'Bislama'],
    [id: 'bla', label: 'Siksika'],
    [id: 'bnt', label: 'Bantu (Other)'],
    [id: 'bos', label: 'Bosnian'],
    [id: 'bra', label: 'Braj'],
    [id: 'bre', label: 'Breton'],
    [id: 'btk', label: 'Batak (Indonesia)'],
    [id: 'bua', label: 'Buriat'],
    [id: 'bug', label: 'Buginese'],
    [id: 'bul', label: 'Bulgarian'],
    [id: 'bur', label: 'Burmese'],
    [id: 'byn', label: 'Blin'],
    [id: 'cad', label: 'Caddo'],
    [id: 'cai', label: 'Central American Indian (Other)'],
    [id: 'car', label: 'Carib'],
    [id: 'cat', label: 'Catalan'],
    [id: 'cau', label: 'Caucasian (Other)'],
    [id: 'ceb', label: 'Cebuano'],
    [id: 'cel', label: 'Celtic (Other)'],
    [id: 'cha', label: 'Chamorro'],
    [id: 'chb', label: 'Chibcha'],
    [id: 'che', label: 'Chechen'],
    [id: 'chg', label: 'Chagatai'],
    [id: 'chi', label: 'Chinese (simplified)'],
    [id: 'chk', label: 'Chuukese'],
    [id: 'chm', label: 'Mari'],
    [id: 'chn', label: 'Chinook jargon'],
    [id: 'cho', label: 'Choctaw'],
    [id: 'chp', label: 'Chipewyan'],
    [id: 'chr', label: 'Cherokee'],
    [id: 'chu', label: 'Church Slavic'],
    [id: 'chv', label: 'Chuvash'],
    [id: 'chy', label: 'Cheyenne'],
    [id: 'cmc', label: 'Chamic languages'],
    [id: 'cop', label: 'Coptic'],
    [id: 'cor', label: 'Cornish'],
    [id: 'cos', label: 'Corsican'],
    [id: 'cpe', label: 'Creoles and pidgins, English based (Other)'],
    [id: 'cpf', label: 'Creoles and pidgins, French-based (Other)'],
    [id: 'cpp', label: 'Creoles and pidgins, Portuguese-based (Other)'],
    [id: 'cre', label: 'Cree'],
    [id: 'crh', label: 'Crimean Tatar'],
    [id: 'crp', label: 'Creoles and pidgins (Other)'],
    [id: 'csb', label: 'Kashubian'],
    [id: 'cus', label: 'Cushitic (Other) couchitiques, autres langues'],
    [id: 'cze', label: 'Czech'],
    [id: 'dak', label: 'Dakota'],
    [id: 'dan', label: 'Danish'],
    [id: 'dar', label: 'Dargwa'],
    [id: 'day', label: 'Dayak'],
    [id: 'del', label: 'Delaware'],
    [id: 'den', label: 'Slave (Athapascan)'],
    [id: 'dgr', label: 'Dogrib'],
    [id: 'din', label: 'Dinka'],
    [id: 'div', label: 'Divehi'],
    [id: 'doi', label: 'Dogri'],
    [id: 'dra', label: 'Dravidian (Other)'],
    [id: 'dua', label: 'Duala'],
    [id: 'dum', label: 'Dutch, Middle (ca.1050-1350)'],
    [id: 'dut', label: 'Dutch'],
    [id: 'dyu', label: 'Dyula'],
    [id: 'dzo', label: 'Dzongkha'],
    [id: 'efi', label: 'Efik'],
    [id: 'egy', label: 'Egyptian (Ancient)'],
    [id: 'eka', label: 'Ekajuk'],
    [id: 'elx', label: 'Elamite'],
    [id: 'eng', label: 'English'],
    [id: 'enm', label: 'English, Middle (1100-1500)'],
    [id: 'epo', label: 'Esperanto'],
    [id: 'est', label: 'Estonian'],
    [id: 'ewe', label: 'Ewe'],
    [id: 'ewo', label: 'Ewondo'],
    [id: 'fan', label: 'Fang'],
    [id: 'fao', label: 'Faroese'],
    [id: 'fat', label: 'Fanti'],
    [id: 'fij', label: 'Fijian'],
    [id: 'fil', label: 'Filipino'],
    [id: 'fin', label: 'Finnish'],
    [id: 'fiu', label: 'Finno-Ugrian (Other)'],
    [id: 'fon', label: 'Fon'],
    [id: 'fre', label: 'French'],
    [id: 'frm', label: 'French, Middle (ca.1400-1600)'],
    [id: 'fro', label: 'French, Old (842-ca.1400)'],
    [id: 'fry', label: 'Frisian'],
    [id: 'ful', label: 'Fulah'],
    [id: 'fur', label: 'Friulian'],
    [id: 'gaa', label: 'Ga'],
    [id: 'gay', label: 'Gayo'],
    [id: 'gba', label: 'Gbaya'],
    [id: 'gem', label: 'Germanic (Other)'],
    [id: 'geo', label: 'Georgian'],
    [id: 'ger', label: 'German'],
    [id: 'gez', label: 'Geez'],
    [id: 'gil', label: 'Gilbertese'],
    [id: 'gla', label: 'Gaelic'],
    [id: 'gle', label: 'Irish'],
    [id: 'glg', label: 'Galician'],
    [id: 'glv', label: 'Manx'],
    [id: 'gmh', label: 'German, Middle High (ca.1050-1500)'],
    [id: 'goh', label: 'German, Old High (ca.750-1050)'],
    [id: 'gon', label: 'Gondi'],
    [id: 'gor', label: 'Gorontalo'],
    [id: 'got', label: 'Gothic'],
    [id: 'grb', label: 'Grebo'],
    [id: 'grc', label: 'Greek, Ancient (to 1453)'],
    [id: 'ell', label: 'Greek'],
    [id: 'grn', label: 'Guarani'],
    [id: 'guj', label: 'Gujarati'],
    [id: 'gwi', label: 'Gwich´in'],
    [id: 'hai', label: 'Haida'],
    [id: 'hat', label: 'Haitian'],
    [id: 'hau', label: 'Hausa'],
    [id: 'haw', label: 'Hawaiian'],
    [id: 'heb', label: 'Hebrew'],
    [id: 'her', label: 'Herero'],
    [id: 'hil', label: 'Hiligaynon'],
    [id: 'him', label: 'Himachali'],
    [id: 'hin', label: 'Hindi'],
    [id: 'hit', label: 'Hittite'],
    [id: 'hmn', label: 'Hmong'],
    [id: 'hmo', label: 'Hiri Motu'],
    [id: 'hrv', label: 'Croatian'],
    [id: 'hun', label: 'Hungarian'],
    [id: 'hup', label: 'Hupa'],
    [id: 'iba', label: 'Iban'],
    [id: 'ibo', label: 'Igbo'],
    [id: 'ice', label: 'Icelandic'],
    [id: 'ido', label: 'Ido'],
    [id: 'iii', label: 'Sichuan Yi'],
    [id: 'ijo', label: 'Ijo'],
    [id: 'iku', label: 'Inuktitut'],
    [id: 'ile', label: 'Interlingue'],
    [id: 'ilo', label: 'Iloko'],
    [id: 'ina', label: 'Interlingua (International Auxiliary Language Asso'],
    [id: 'inc', label: 'Indic (Other)'],
    [id: 'ind', label: 'Indonesian'],
    [id: 'ine', label: 'Indo-European (Other)'],
    [id: 'inh', label: 'Ingush'],
    [id: 'ipk', label: 'Inupiaq'],
    [id: 'ira', label: 'Iranian (Other)'],
    [id: 'iro', label: 'Iroquoian languages'],
    [id: 'ita', label: 'Italian'],
    [id: 'jav', label: 'Javanese'],
    [id: 'jpn', label: 'Japanese'],
    [id: 'jpr', label: 'Judeo-Persian'],
    [id: 'jrb', label: 'Judeo-Arabic'],
    [id: 'kaa', label: 'Kara-Kalpak'],
    [id: 'kab', label: 'Kabyle'],
    [id: 'kac', label: 'Kachin'],
    [id: 'kal', label: 'Kalaallisut'],
    [id: 'kam', label: 'Kamba'],
    [id: 'kan', label: 'Kannada'],
    [id: 'kar', label: 'Karen'],
    [id: 'kas', label: 'Kashmiri'],
    [id: 'kau', label: 'Kanuri'],
    [id: 'kaw', label: 'Kawi'],
    [id: 'kaz', label: 'Kazakh'],
    [id: 'kbd', label: 'Kabardian'],
    [id: 'kha', label: 'Khasi'],
    [id: 'khi', label: 'Khoisan (Other)'],
    [id: 'khm', label: 'Khmer'],
    [id: 'kho', label: 'Khotanese'],
    [id: 'kik', label: 'Kikuyu'],
    [id: 'kin', label: 'Kinyarwanda'],
    [id: 'kir', label: 'Kirghiz'],
    [id: 'kmb', label: 'Kimbundu'],
    [id: 'kok', label: 'Konkani'],
    [id: 'kom', label: 'Komi'],
    [id: 'kon', label: 'Kongo'],
    [id: 'kor', label: 'Korean'],
    [id: 'kos', label: 'Kosraean'],
    [id: 'kpe', label: 'Kpelle'],
    [id: 'krc', label: 'Karachay-Balkar'],
    [id: 'kro', label: 'Kru'],
    [id: 'kru', label: 'Kurukh'],
    [id: 'kua', label: 'Kuanyama'],
    [id: 'kum', label: 'Kumyk'],
    [id: 'kur', label: 'Kurdish'],
    [id: 'kut', label: 'Kutenai'],
    [id: 'lad', label: 'Ladino'],
    [id: 'lah', label: 'Lahnda'],
    [id: 'lam', label: 'Lamba'],
    [id: 'lao', label: 'Lao'],
    [id: 'lat', label: 'Latin'],
    [id: 'lav', label: 'Latvian'],
    [id: 'lez', label: 'Lezghian'],
    [id: 'lim', label: 'Limburgan'],
    [id: 'lin', label: 'Lingala'],
    [id: 'lit', label: 'Lithuanian'],
    [id: 'lol', label: 'Mongo'],
    [id: 'loz', label: 'Lozi'],
    [id: 'ltz', label: 'Luxembourgish'],
    [id: 'lua', label: 'Luba-Lulua'],
    [id: 'lub', label: 'Luba-Katanga'],
    [id: 'lug', label: 'Ganda'],
    [id: 'lui', label: 'Luiseno'],
    [id: 'lun', label: 'Lunda'],
    [id: 'luo', label: 'Luo (Kenya and Tanzania)'],
    [id: 'lus', label: 'lushai'],
    [id: 'mac', label: 'Macedonian'],
    [id: 'mad', label: 'Madurese'],
    [id: 'mag', label: 'Magahi'],
    [id: 'mah', label: 'Marshallese'],
    [id: 'mai', label: 'Maithili'],
    [id: 'mak', label: 'Makasar'],
    [id: 'mal', label: 'Malayalam'],
    [id: 'man', label: 'Mandingo'],
    [id: 'mao', label: 'Maori'],
    [id: 'map', label: 'Austronesian (Other)'],
    [id: 'mar', label: 'Marathi'],
    [id: 'mas', label: 'Masai'],
    [id: 'may', label: 'Malay'],
    [id: 'mdf', label: 'Moksha'],
    [id: 'mdr', label: 'Mandar'],
    [id: 'men', label: 'Mende'],
    [id: 'mga', label: 'Irish, Middle (900-1200)'],
    [id: 'mic', label: 'Mikmaq'],
    [id: 'min', label: 'Minangkabau'],
    [id: 'mis', label: 'Miscellaneous languages'],
    [id: 'mkh', label: 'Mon-Khmer (Other)'],
    [id: 'mlg', label: 'Malagasy'],
    [id: 'mlt', label: 'Maltese'],
    [id: 'mnc', label: 'Manchu'],
    [id: 'mni', label: 'Manipuri'],
    [id: 'mno', label: 'Manobo languages'],
    [id: 'moh', label: 'Mohawk'],
    [id: 'mol', label: 'Moldavian'],
    [id: 'mon', label: 'Mongolian'],
    [id: 'mos', label: 'Mossi'],
    [id: 'mwl', label: 'Mirandese'],
    [id: 'mul', label: 'Multiple languages'],
    [id: 'mun', label: 'Munda languages'],
    [id: 'mus', label: 'Creek'],
    [id: 'mwr', label: 'Marwari'],
    [id: 'myn', label: 'Mayan languages'],
    [id: 'myv', label: 'Erzya'],
    [id: 'nah', label: 'Nahuatl'],
    [id: 'nai', label: 'North American Indian'],
    [id: 'nap', label: 'Neapolitan'],
    [id: 'nau', label: 'Nauru'],
    [id: 'nav', label: 'Navajo'],
    [id: 'nbl', label: 'Ndebele, South'],
    [id: 'nde', label: 'Ndebele, North'],
    [id: 'ndo', label: 'Ndonga'],
    [id: 'nds', label: 'Low German'],
    [id: 'nep', label: 'Nepali'],
    [id: 'new', label: 'Nepal Bhasa'],
    [id: 'nia', label: 'Nias'],
    [id: 'nic', label: 'Niger-Kordofanian (Other)'],
    [id: 'niu', label: 'Niuean'],
    [id: 'nno', label: 'Norwegian Nynorsk'],
    [id: 'nob', label: 'Norwegian Bokmal'],
    [id: 'nog', label: 'Nogai'],
    [id: 'non', label: 'Norse, Old'],
    [id: 'nor', label: 'Norwegian'],
    [id: 'nso', label: 'Northern Sotho'],
    [id: 'nub', label: 'Nubian languages'],
    [id: 'nwc', label: 'Classical Newari'],
    [id: 'nya', label: 'Chichewa'],
    [id: 'nym', label: 'Nyamwezi'],
    [id: 'nyn', label: 'Nyankole'],
    [id: 'nyo', label: 'Nyoro'],
    [id: 'nzi', label: 'Nzima'],
    [id: 'oci', label: 'Occitan'],
    [id: 'oji', label: 'Ojibwa'],
    [id: 'ori', label: 'Oriya'],
    [id: 'orm', label: 'Oromo'],
    [id: 'osa', label: 'Osage'],
    [id: 'oss', label: 'Ossetian'],
    [id: 'ota', label: 'Turkish, Ottoman (1500-1928)'],
    [id: 'oto', label: 'Otomian languages'],
    [id: 'paa', label: 'Papuan (Other)'],
    [id: 'pag', label: 'Pangasinan'],
    [id: 'pal', label: 'Pahlavi'],
    [id: 'pam', label: 'Pampanga'],
    [id: 'pan', label: 'Panjabi'],
    [id: 'pap', label: 'Papiamento'],
    [id: 'pau', label: 'Palauan'],
    [id: 'peo', label: 'Persian, Old (ca.600-400 B.C.)'],
    [id: 'per', label: 'Persian'],
    [id: 'phi', label: 'Philippine (Other)'],
    [id: 'phn', label: 'Phoenician'],
    [id: 'pli', label: 'Pali'],
    [id: 'pol', label: 'Polish'],
    [id: 'pon', label: 'Pohnpeian'],
    [id: 'por', label: 'Portuguese'],
    [id: 'pra', label: 'Prakrit languages'],
    [id: 'pro', label: 'Provençal, Old (to 1500)'],
    [id: 'pus', label: 'Pushto'],
    [id: 'que', label: 'Quechua'],
    [id: 'raj', label: 'Rajasthani'],
    [id: 'rap', label: 'Rapanui'],
    [id: 'rar', label: 'Rarotongan'],
    [id: 'roa', label: 'Romance (Other)'],
    [id: 'roh', label: 'Raeto-Romance'],
    [id: 'rom', label: 'Romany'],
    [id: 'run', label: 'Rundi'],
    [id: 'rup', label: 'Aromanian'],
    [id: 'rus', label: 'Russian'],
    [id: 'sad', label: 'Sandawe'],
    [id: 'sag', label: 'Sango'],
    [id: 'sah', label: 'Yakut'],
    [id: 'sai', label: 'South American Indian (Other)'],
    [id: 'sal', label: 'Salishan languages'],
    [id: 'sam', label: 'Samaritan Aramaic'],
    [id: 'san', label: 'Sanskrit'],
    [id: 'sas', label: 'Sasak'],
    [id: 'sat', label: 'Santali'],
    [id: 'scc', label: 'Serbian'],
    [id: 'scn', label: 'Sicilian'],
    [id: 'sco', label: 'Scots'],
    [id: 'sel', label: 'Selkup'],
    [id: 'sem', label: 'Semitic (Other)'],
    [id: 'sga', label: 'Irish, Old (to 900)'],
    [id: 'sgn', label: 'Sign Languages'],
    [id: 'shn', label: 'Shan'],
    [id: 'sid', label: 'Sidamo'],
    [id: 'sin', label: 'Sinhalese'],
    [id: 'sio', label: 'Siouan languages'],
    [id: 'sit', label: 'Sino-Tibetan (Other)'],
    [id: 'sla', label: 'Slavic (Other)'],
    [id: 'slo', label: 'Slovak'],
    [id: 'slv', label: 'Slovenian'],
    [id: 'sma', label: 'Southern Sami'],
    [id: 'sme', label: 'Northern Sami'],
    [id: 'smi', label: 'Sami languages (Other)'],
    [id: 'smj', label: 'Lule Sami'],
    [id: 'smn', label: 'Inari Sami'],
    [id: 'smo', label: 'Samoan'],
    [id: 'sms', label: 'Skolt Sami'],
    [id: 'sna', label: 'Shona'],
    [id: 'snd', label: 'Sindhi'],
    [id: 'snk', label: 'Soninke'],
    [id: 'sog', label: 'Sogdian'],
    [id: 'som', label: 'Somali'],
    [id: 'son', label: 'Songhai'],
    [id: 'sot', label: 'Sotho, Southern'],
    [id: 'spa', label: 'Spanish'],
    [id: 'srd', label: 'Sardinian'],
    [id: 'srr', label: 'Serer'],
    [id: 'ssa', label: 'Nilo-Saharan (Other)'],
    [id: 'ssw', label: 'Swati'],
    [id: 'suk', label: 'Sukuma'],
    [id: 'sun', label: 'Sundanese'],
    [id: 'sus', label: 'Susu'],
    [id: 'sux', label: 'Sumerian'],
    [id: 'swa', label: 'Swahili'],
    [id: 'swe', label: 'Swedish'],
    [id: 'syr', label: 'Syriac'],
    [id: 'tah', label: 'Tahitian'],
    [id: 'tai', label: 'Tai (Other)'],
    [id: 'tam', label: 'Tamil'],
    [id: 'tat', label: 'Tatar'],
    [id: 'tel', label: 'Telugu'],
    [id: 'tem', label: 'Timne'],
    [id: 'ter', label: 'Tereno'],
    [id: 'tet', label: 'Tetum'],
    [id: 'tgk', label: 'Tajik'],
    [id: 'tgl', label: 'Tagalog'],
    [id: 'tha', label: 'Thai'],
    [id: 'tib', label: 'Tibetan'],
    [id: 'tig', label: 'Tigre'],
    [id: 'tir', label: 'Tigrinya'],
    [id: 'tiv', label: 'Tiv'],
    [id: 'tkl', label: 'Tokelau'],
    [id: 'tlh', label: 'Klingon'],
    [id: 'tli', label: 'Tlingit'],
    [id: 'tmh', label: 'Tamashek'],
    [id: 'tog', label: 'Tonga (Nyasa)'],
    [id: 'ton', label: 'Tonga (Tonga Islands)'],
    [id: 'tpi', label: 'Tok Pisin'],
    [id: 'tsi', label: 'Tsimshian'],
    [id: 'tsn', label: 'Tswana'],
    [id: 'tso', label: 'Tsonga'],
    [id: 'tuk', label: 'Turkmen'],
    [id: 'tum', label: 'Tumbuka'],
    [id: 'tup', label: 'Tupi languages'],
    [id: 'tur', label: 'Turkish'],
    [id: 'tut', label: 'Altaic (Other)'],
    [id: 'tvl', label: 'Tuvalu'],
    [id: 'twi', label: 'Twi'],
    [id: 'tyv', label: 'Tuvinian'],
    [id: 'udm', label: 'Udmurt'],
    [id: 'uga', label: 'Ugaritic'],
    [id: 'uig', label: 'Uighur'],
    [id: 'ukr', label: 'Ukrainian'],
    [id: 'umb', label: 'Umbundu'],
    [id: 'und', label: 'Undetermined'],
    [id: 'urd', label: 'Urdu'],
    [id: 'uzb', label: 'Uzbek'],
    [id: 'vai', label: 'Vai'],
    [id: 'ven', label: 'Venda'],
    [id: 'vie', label: 'Vietnamese'],
    [id: 'vol', label: 'Volapük'],
    [id: 'vot', label: 'Votic'],
    [id: 'wak', label: 'Wakashan languages'],
    [id: 'wal', label: 'Walamo'],
    [id: 'war', label: 'Waray'],
    [id: 'was', label: 'Washo'],
    [id: 'wel', label: 'Welsh'],
    [id: 'wen', label: 'Sorbian languages'],
    [id: 'wln', label: 'Walloon'],
    [id: 'wol', label: 'Wolof'],
    [id: 'xal', label: 'Kalmyk'],
    [id: 'xho', label: 'Xhosa'],
    [id: 'yao', label: 'Yao'],
    [id: 'yap', label: 'Yapese'],
    [id: 'yid', label: 'Yiddish'],
    [id: 'yor', label: 'Yoruba'],
    [id: 'ypk', label: 'Yupik languages'],
    [id: 'zap', label: 'Zapotec'],
    [id: 'zen', label: 'Zenaga'],
    [id: 'zha', label: 'Zhuang'],
    [id: 'znd', label: 'Zande'],
    [id: 'zul', label: 'Zulu'],
    [id: 'zun', label: 'Zuni'],
    [id: 'rum', label: 'Romanian'],
    [id: 'pob', label: 'Portuguese (BR)'],
    [id: 'mne', label: 'Montenegrin'],
    [id: 'zht', label: 'Chinese (traditional)'],
    [id: 'zhe', label: 'Chinese bilingual'],
    [id: 'pom', label: 'Portuguese (MZ)'],
    [id: 'ext', label: 'Extremaduran']
  ]
}


