package com.teppo.kasarinviihdevisailu;

import java.util.HashMap;
import java.util.Map;

public class Questions {
    private Map<Integer, Kysymys> kysymykset;

    public Questions() {
        this.kysymykset = new HashMap<>();
        System.out.println("konstruktori");

        // Lisätään 100 kysymystä
        lisaaKysymys(2,
                "Mikä yhtye julkaisi albumin 'Back in Black' vuonna 1980?\nA) Led Zeppelin B) AC/DC C) Queen D) Pink Floyd",
                "b");
        lisaaKysymys(3,
                "Missä kaupungissa järjestettiin vuoden 1980 kesäolympialaiset?\nA) Montreal B) Los Angeles C) Moscow D) Helsinki",
                "c");
        lisaaKysymys(4,
                "Mikä oli vuoden 1980 katsotuin elokuva Yhdysvalloissa?\nA) Star Wars: The Empire Strikes Back B) 9 to 5 C) The Shining D) Airplane!",
                "c");
        lisaaKysymys(5,
                "Kuka voitti miesten Wimbledonin tennisturnauksen vuonna 1980?\nA) Björn Borg B) John McEnroe C) Jimmy Connors D) Ivan Lendl",
                "a");
        lisaaKysymys(6,
                "Mikä oli vuoden 1980 Yhdysvaltain presidentinvaalien voittajan nimi?\nA) Ronald Reagan B) Jimmy Carter C) Gerald Ford D) Richard Nixon",
                "b");
        lisaaKysymys(7,
                "Mikä tietokonepeli julkaistiin vuonna 1980 ja tuli tunnetuksi kolikkopelinä?\nA) Space Invaders B) Pac-Man C) Asteroids D) Donkey Kong",
                "b");
        lisaaKysymys(8,
                "Mikä bändi julkaisi albumin 'The Wall' vuonna 1980?\nA) The Rolling Stones B) Pink Floyd C) The Beatles D) Queen",
                "b");
        lisaaKysymys(9,
                "Kuka näyttelijä voitti parhaan miespääosan Oscar-palkinnon vuonna 1980 roolistaan elokuvassa 'Raging Bull'?\nA) Robert De Niro B) Al Pacino C) Jack Nicholson D) Dustin Hoffman",
                "a");
        lisaaKysymys(10,
                "Missä kaupungissa järjestettiin vuoden 1980 talviolympialaiset?\nA) Innsbruck B) Lake Placid C) Grenoble D) Sapporo",
                "b");
        lisaaKysymys(11,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1981?\nA) Chariots of Fire B) Raiders of the Lost Ark C) Ordinary People D) E.T. the Extra-Terrestrial",
                "a");
        lisaaKysymys(12,
                "Mikä yhtye julkaisi albumin 'Ghost in the Machine' vuonna 1981?\nA) The Rolling Stones B) U2 C) The Police D) Queen",
                "c");
        lisaaKysymys(13,
                "Missä kaupungissa järjestettiin ensimmäiset MTV Video Music Awards vuonna 1981?\nA) Los Angeles B) New York C) London D) Miami",
                "b");
        lisaaKysymys(14,
                "Mikä oli vuoden 1981 katsotuin elokuva Yhdysvalloissa?\nA) Raiders of the Lost Ark B) E.T. the Extra-Terrestrial C) On Golden Pond D) Star Wars: The Empire Strikes Back",
                "c");
        lisaaKysymys(15,
                "Kuka voitti Nobel-rauhanpalkinnon vuonna 1981?\nA) Mother Teresa B) Lech Wałęsa C) United Nations High Commissioner for Refugees (UNHCR) D) Alva Myrdal",
                "c");
        lisaaKysymys(16,
                "Mikä tietokonepeli julkaistiin vuonna 1981 ja sai suuren suosion?\nA) Space Invaders B) Pac-Man C) Donkey Kong D) Frogger",
                "b");
        lisaaKysymys(17,
                "Kuka voitti miesten Wimbledonin tennisturnauksen vuonna 1981?\nA) John McEnroe B) Björn Borg C) Jimmy Connors D) Ivan Lendl",
                "a");
        lisaaKysymys(18,
                "Mikä Yhdysvaltain presidentti oli virassa vuonna 1981?\nA) Ronald Reagan B) Jimmy Carter C) Gerald Ford D) Richard Nixon",
                "b");
        lisaaKysymys(19,
                "Mikä oli vuoden 1981 menestynein animaatioelokuva?\nA) The Little Mermaid B) The Fox and the Hound C) An American Tail D) The Rescuers",
                "d");
        lisaaKysymys(20,
                "Kuka näyttelijä voitti parhaan miespääosan Oscar-palkinnon vuonna 1981 roolistaan elokuvassa 'On Golden Pond'?\nA) Dustin Hoffman B) Tom Hanks C) Jack Nicholson D) Henry Fonda",
                "d");
        lisaaKysymys(21,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1982?\nA) E.T. the Extra-Terrestrial B) Gandhi C) Chariots of Fire D) Raiders of the Lost Ark",
                "c");
        lisaaKysymys(22,
                "Kuka laulaja julkaisi kappaleen 'Thriller' vuonna 1982, joka nousi suureksi hitiksi?\nA) Michael Jackson B) Prince C) Madonna D) Whitney Houston",
                "a");
        lisaaKysymys(23,
                "Missä kaupungissa järjestettiin vuoden 1982 ensimmäiset Commodore 64 -tietokoneen maailmanmestaruuskilpailut?\nA) Los Angeles B) New York C) Las Vegas D) Helsinki",
                "d");
        lisaaKysymys(24,
                "Mikä tietokonepeli julkaistiin vuonna 1982 ja sai suuren suosion?\nA) Donkey Kong B) Pac-Man C) E.T. the Extra-Terrestrial D) Ms. Pac-Man",
                "d");
        lisaaKysymys(25,
                "Kuka voitti Nobel-rauhanpalkinnon vuonna 1982?\nA) Mother Teresa B) Lech Wałęsa C) Alva Myrdal D) Alfonso García Robles ja Alva Myrdal",
                "d");
        lisaaKysymys(26,
                "Mikä oli vuoden 1982 katsotuin elokuva Yhdysvalloissa?\nA) E.T. the Extra-Terrestrial B) Star Wars: The Empire Strikes Back C) Raiders of the Lost Ark D) Blade Runner",
                "a");
        lisaaKysymys(27,
                "Mikä yhtye julkaisi albumin 'The Number of the Beast' vuonna 1982?\nA) Metallica B) Iron Maiden C) Black Sabbath D) Slayer",
                "b");
        lisaaKysymys(28,
                "Kuka Yhdysvaltain presidentti oli virassa vuonna 1982?\nA) Ronald Reagan B) Jimmy Carter C) Gerald Ford D) Richard Nixon",
                "a");
        lisaaKysymys(29,
                "Mikä oli vuoden 1982 menestynein animaatioelokuva?\nA) The Lion King B) The Little Mermaid C) Snow White and the Seven Dwarfs D) Bambi",
                "c");
        lisaaKysymys(30,
                "Missä maassa järjestettiin vuoden 1982 jalkapallon maailmanmestaruuskilpailut?\nA) Ranska B) Espanja C) Italia D) Espanja",
                "d");
        lisaaKysymys(31,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1983?\nA) E.T. the Extra-Terrestrial B) Terms of Endearment C) Gandhi D) Raiders of the Lost Ark",
                "b");
        lisaaKysymys(32,
                "Kuka laulaja julkaisi albumin 'Thriller' vuonna 1983, joka tuli yhdeksi kaikkien aikojen myydyimmistä albumeista?\nA) Prince B) Michael Jackson C) Madonna D) Bruce Springsteen",
                "b");
        lisaaKysymys(33,
                "Missä kaupungissa järjestettiin vuoden 1983 ensimmäiset MTV Video Music Awards?\nA) Los Angeles B) New York C) Miami D) Chicago",
                "b");
        lisaaKysymys(34,
                "Mikä tietokonepeli julkaistiin vuonna 1983 ja nousi suureen suosioon?\nA) Pac-Man B) Super Mario Bros. C) Tetris D) Giana Sisters",
                "b");
        lisaaKysymys(35,
                "Kuka voitti Nobel-rauhanpalkinnon vuonna 1983?\nA) Desmond Tutu B) Mother Teresa C) Lech Wałęsa D) Nelson Mandela",
                "a");
        lisaaKysymys(36,
                "Mikä oli vuoden 1983 katsotuin elokuva Yhdysvalloissa?\nA) Star Wars: Return of the Jedi B) E.T. the Extra-Terrestrial C) Flashdance D) Terms of Endearment",
                "b");
        lisaaKysymys(37,
                "Mikä televisiosarja sai ensi-iltansa vuonna 1983 ja seurasi nuoren lääkärin seikkailuja sairaalassa?\nA) MAS*H B) Grey's Anatomy C) ER D) St. Elsewhere",
                "d");
        lisaaKysymys(38,
                "Kuka Yhdysvaltain presidentti astui virkaan vuonna 1983?\nA) Ronald Reagan B) Jimmy Carter C) Gerald Ford D) Richard Nixon",
                "a");
        lisaaKysymys(39,
                "Mikä yhtye julkaisi albumin 'Synchronicity' vuonna 1983?\nA) U2 B) The Police C) Duran Duran D) Depeche Mode",
                "b");
        lisaaKysymys(40,
                "Mikä oli vuoden 1983 menestynein animaatioelokuva?\nA) The Lion King B) The Little Mermaid C) Snow White and the Seven Dwarfs D) Aladdin",
                "c");
        lisaaKysymys(41,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1984?\nA) The Right Stuff B) Terms of Endearment C) Scarface D) Amadeus",
                "b");
        lisaaKysymys(42,
                "Mikä Michael Jacksonin albumi julkaistiin vuonna 1984?\nA) Bad B) Thriller C) Off the Wall D) Victory",
                "d");
        lisaaKysymys(43,
                "Missä kaupungissa järjestettiin vuoden 1984 kesäolympialaiset?\nA) Moskova B) Los Angeles C) Soul D) München",
                "b");
        lisaaKysymys(44,
                "Mikä Apple-tietokone julkaistiin vuonna 1984 ja esiteltiin kuuluisassa Super Bowl -mainoksessa?\nA) Macintosh B) Apple II C) Macbook D) iMac",
                "a");
        lisaaKysymys(45,
                "Kuka kirjoitti kirjan 'Neuvostoliitto - elävä valta' vuonna 1984?\nA) George Orwell B) Aldous Huxley C) Ray Bradbury D) Margaret Atwood",
                "a");
        lisaaKysymys(46,
                "Mikä oli vuoden 1984 katsotuin elokuva Yhdysvalloissa?\nA) Indiana Jones and the Temple of Doom B) Ghostbusters C) Beverly Hills Cop D) Gremlins",
                "b");
        lisaaKysymys(47,
                "Kuka voitti miesten yksilötenniksen kultamitalin vuoden 1984 kesäolympialaisissa?\nA) John McEnroe B) Ivan Lendl C) Stefan Edberg D) Yannick Noah",
                "d");
        lisaaKysymys(48,
                "Mikä oli vuoden 1984 Grammy-palkittu Vuoden levy (Record of the Year)?\nA) 'Every Breath You Take' - The Police B) 'Beat It' - Michael Jackson C) 'Flashdance... What a Feeling' - Irene Cara D) 'Billie Jean' - Michael Jackson",
                "a");
        lisaaKysymys(49,
                "Mikä oli ensimmäinen CD-levy, joka julkaistiin kaupallisesti vuonna 1984?\nA) Dire Straits - Brothers in Arms B) ABBA - The Visitors C) Billy Joel - 52nd Street D) Bruce Springsteen - Born in the U.S.A.",
                "d");
        lisaaKysymys(50,
                "Mikä oli ensimmäinen Macintosh-tietokoneen mainoslause vuonna 1984?\nA) 'Think Different' B) 'Just Do It' C) 'The Power to Be Your Best' D) '1984 won't be like '1984''",
                "d");
        lisaaKysymys(51,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1985?\nA) Rain Man B) Platoon C) Amadeus D) The Color Purple",
                "c");
        lisaaKysymys(52,
                "Mikä oli vuoden 1985 ensimmäinen ykköshitikappale Billboard Hot 100 -listalla?\nA) 'Wake Me Up Before You Go-Go' - Wham! B) 'Careless Whisper' - Wham! featuring George Michael C) 'Like a Virgin' - Madonna D) 'I Want to Know What Love Is' - Foreigner",
                "d");
        lisaaKysymys(53,
                "Missä kaupungissa järjestettiin vuoden 1985 Live Aid -hyväntekeväisyyskonsertti?\nA) New York B) Lontoo C) Los Angeles D) Sydney",
                "b");
        lisaaKysymys(54, "Mikä avaruussukkula räjähti vuonna 1985?\nA) Columbia B) Challenger C) Discovery D) Atlantis",
                "b");
        lisaaKysymys(55,
                "Mikä yhtye sävelsi kappaleen 'We Are the World' vuonna 1985?\nA) Queen B) U2 C) USA for Africa D) Dire Straits",
                "c");
        lisaaKysymys(56,
                "Mikä oli vuoden 1985 katsotuin elokuva Yhdysvalloissa?\nA) Back to the Future B) Rocky IV C) Rambo: First Blood Part II D) The Color Purple",
                "a");
        lisaaKysymys(57,
                "Kuka voitti Nobel-kaunokirjallisuuspalkinnon vuonna 1985?\nA) Gabriel García Márquez B) Toni Morrison C) Wole Soyinka D) J.M. Coetzee",
                "c");
        lisaaKysymys(58,
                "Mikä oli ensimmäinen internetin verkkotunnus (domain), joka rekisteröitiin vuonna 1985?\nA) .com B) .net C) .edu D) .symbolics",
                "d");
        lisaaKysymys(59,
                "Missä pidettiin ensimmäiset MTV Video Music Awards vuonna 1985?\nA) New York B) Los Angeles C) Miami D) Radio City Music Hall, New York",
                "d");
        lisaaKysymys(60,
                "Mikä oli vuoden 1985 menestynein tietokonepeli?\nA) Super Mario Bros. B) Tetris C) The Legend of Zelda D) Duck Hunt",
                "d");
        lisaaKysymys(61,
                "Mikä tapahtui Tšernobylin ydinvoimalassa huhtikuussa 1986?\nA) Ensimmäinen avaruuskävely B) Ensimmäinen sydämensiirto C) Ydinturma D) Maailman suurin musiikkifestivaali",
                "c");
        lisaaKysymys(62,
                "Mikä oli vuoden 1986 kesäolympialaisten isäntäkaupunki?\nA) Los Angeles B) Moskova C) Soul D) Barcelona",
                "c");
        lisaaKysymys(63, "Mikä oli ensimmäinen verkkomainen virus?\nA) Melissa B) ILOVEYOU C) Chernobyl D) Code Red",
                "c");
        lisaaKysymys(64,
                "Kuka voitti vuoden 1986 jalkapallon maailmanmestaruuden?\nA) Saksa B) Brasilia C) Argentiina D) Italia",
                "c");
        lisaaKysymys(65,
                "Mikä avaruussukkula tuhoutui vuonna 1986 pian laukaisun jälkeen?\nA) Discovery B) Challenger C) Atlantis D) Endeavour",
                "b");
        lisaaKysymys(66,
                "Mikä teknologiajätti perustettiin vuonna 1986?\nA) Microsoft B) Apple C) IBM D) Cisco Systems", "d");
        lisaaKysymys(67,
                "Mikä oli ensimmäinen Pixar-animaatioelokuva, joka julkaistiin vuonna 1986?\nA) Toy Story B) Finding Nemo C) Luxo Jr. D) Monsters, Inc.",
                "c");
        lisaaKysymys(68,
                "Mikä legendaarinen videopeli julkaistiin vuonna 1986?\nA) Super Mario Bros. B) Pac-Man C) The Legend of Zelda D) Tetris",
                "c");
        lisaaKysymys(69,
                "Kuka sai Nobelin rauhanpalkinnon vuonna 1986?\nA) Nelson Mandela B) Lech Wałęsa C) Elie Wiesel D) El Salvadorin arkkipiispa Oscar Romero",
                "d");
        lisaaKysymys(70,
                "Mikä oli ensimmäinen kaupallinen internet-palveluntarjoaja vuonna 1986?\nA) AOL B) CompuServe C) Prodigy D) EarthLink",
                "b");
        lisaaKysymys(71,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1987?\nA) The Last Emperor B) Platoon C) Rain Man D) Good Morning, Vietnam",
                "c");
        lisaaKysymys(72,
                "Mikä yhtye julkaisi albumin 'The Joshua Tree' vuonna 1987?\nA) U2 B) Bon Jovi C) Guns N' Roses D) Duran Duran",
                "a");
        lisaaKysymys(73,
                "Missä kaupungissa järjestettiin vuoden 1987 G7-huippukokous?\nA) Tokyo B) London C) Paris D) Venice",
                "d");
        lisaaKysymys(75,
                "Mikä oli vuoden 1987 katsotuin elokuva Yhdysvalloissa?\nA) Fatal Attraction B) Three Men and a Baby C) Beverly Hills Cop II D) Dirty Dancing",
                "a");
        lisaaKysymys(75,
                "Kuka voitti miesten Wimbledonin tennisturnauksen vuonna 1987?\nA) Boris Becker B) Stefan Edberg C) Pat Cash D) Ivan Lendl",
                "c");
        lisaaKysymys(76,
                "Mikä tietokonepeli julkaistiin vuonna 1987 ja sai suuren suosion?\nA) Super Mario Bros. B) The Legend of Zelda C) Street Fighter D) Final Fantasy",
                "d");
        lisaaKysymys(77,
                "Kuka näyttelijä voitti parhaan naispääosan Oscar-palkinnon vuonna 1987 roolistaan elokuvassa 'Moonstruck'?\nA) Meryl Streep B) Jodie Foster C) Cher D) Sally Field",
                "c");
        lisaaKysymys(78,
                "Mikä animaatioelokuva julkaistiin vuonna 1987 ja kertoi tarinan nuoresta merenneidosta?\nA) The Lion King B) The Little Mermaid C) Beauty and the Beast D) Aladdin",
                "b");
        lisaaKysymys(79,
                "Mikä oli vuoden 1987 menestynein televisiosarja?\nA) The Cosby Show B) Cheers C) A Different World D) Full House",
                "d");
        lisaaKysymys(80,
                "Missä kaupungissa järjestettiin vuoden 1987 yleisurheilun maailmanmestaruuskilpailut?\nA) Helsinki B) Rome C) Seoul D) Tokyo",
                "c");
        lisaaKysymys(81,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1988?\nA) Rain Man B) The Last Emperor C) Good Morning, Vietnam D) Dangerous Liaisons",
                "b");
        lisaaKysymys(82,
                "Mikä yhtye julkaisi albumin 'Green' vuonna 1988?\nA) R.E.M. B) U2 C) Depeche Mode D) The Cure", "a");
        lisaaKysymys(83,
                "Missä kaupungissa järjestettiin vuoden 1988 kesäolympialaiset?\nA) Seoul B) Los Angeles C) Moscow D) Tokyo",
                "a");
        lisaaKysymys(84,
                "Mikä oli vuoden 1988 katsotuin elokuva Yhdysvalloissa?\nA) Rain Man B) Who Framed Roger Rabbit C) Coming to America D) Big",
                "c");
        lisaaKysymys(85,
                "Kuka voitti naisten Wimbledonin tennisturnauksen vuonna 1988?\nA) Steffi Graf B) Martina Navratilova C) Chris Evert D) Gabriela Sabatini",
                "a");
        lisaaKysymys(86,
                "Mikä tietokonepeli julkaistiin vuonna 1988 ja tuli suosituksi tasohyppelypeliksi?\nA) Super Mario Bros. B) Mega Man 2 C) The Legend of Zelda D) DuckTales",
                "b");
        lisaaKysymys(87,
                "Kuka näyttelijä voitti parhaan miespääosan Oscar-palkinnon vuonna 1988 roolistaan elokuvassa 'Wall Street'?\nA) Tom Hanks B) Dustin Hoffman C) Michael Douglas D) Jack Nicholson",
                "c");
        lisaaKysymys(88,
                "Mikä animaatioelokuva julkaistiin vuonna 1988 ja kertoi tarinan nuoresta leijonasta?\nA) The Little Mermaid B) Beauty and the Beast C) The Lion King D) Aladdin",
                "c");
        lisaaKysymys(89,
                "Mikä oli vuoden 1988 menestynein televisiosarja?\nA) The Cosby Show B) Roseanne C) A Different World D) The Wonder Years",
                "d");
        lisaaKysymys(90,
                "Missä kaupungissa järjestettiin vuoden 1988 talviolympialaiset?\nA) Calgary B) Lake Placid C) Sarajevo D) Innsbruck",
                "a");
        lisaaKysymys(91,
                "Mikä elokuva voitti parhaan elokuvan Oscar-palkinnon vuonna 1989?\nA) Rain Man B) Driving Miss Daisy C) Born on the Fourth of July D) My Left Foot",
                "b");
        lisaaKysymys(92,
                "Mikä yhtye julkaisi albumin 'Disintegration' vuonna 1989?\nA) The Cure B) Depeche Mode C) U2 D) R.E.M.",
                "a");
        lisaaKysymys(93,
                "Missä kaupungissa järjestettiin vuoden 1989 kesäolympialaiset?\nA) Seoul B) Los Angeles C) Barcelona D) Moscow",
                "c");
        lisaaKysymys(94,
                "Mikä oli vuoden 1989 katsotuin elokuva Yhdysvalloissa?\nA) Batman B) Indiana Jones and the Last Crusade C) Back to the Future Part II D) The Little Mermaid",
                "a");
        lisaaKysymys(95,
                "Kuka voitti miesten Wimbledonin tennisturnauksen vuonna 1989?\nA) Stefan Edberg B) Boris Becker C) Pete Sampras D) Ivan Lendl",
                "a");
        lisaaKysymys(96,
                "Mikä tietokonepeli julkaistiin vuonna 1989 ja sai suuren suosion?\nA) SimCity B) Super Mario Bros. 3 C) The Legend of Zelda: Link's Awakening D) Tetris",
                "a");
        lisaaKysymys(97,
                "Kuka näyttelijä voitti parhaan naispääosan Oscar-palkinnon vuonna 1989 roolistaan elokuvassa 'The Accused'?\nA) Jodie Foster B) Meryl Streep C) Sally Field D) Jessica Tandy",
                "a");
        lisaaKysymys(98,
                "Mikä animaatioelokuva julkaistiin vuonna 1989 ja kertoi tarinan lelujen seikkailuista?\nA) Beauty and the Beast B) Aladdin C) Toy Story D) The Lion King",
                "c");
        lisaaKysymys(99,
                "Mikä oli vuoden 1989 menestynein televisiosarja?\nA) Cheers B) The Cosby Show C) Roseanne D) Seinfeld",
                "d");
        lisaaKysymys(100,
                "Missä kaupungissa järjestettiin vuoden 1989 jalkapallon naisten maailmanmestaruuskilpailut?\nA) Stockholm B) Beijing C) Lontoo D) Guangzhou",
                "d");
        System.out.println("kysymykset lisätty");
    }

    private void lisaaKysymys(int id, String kysymys, String oikeaVastaus) {
        Kysymys uusiKysymys = new Kysymys(id, kysymys, oikeaVastaus);
        kysymykset.put(id, uusiKysymys);
    }

    public Map<Integer, Kysymys> getKysymykset() {
        return kysymykset;
    }
}
