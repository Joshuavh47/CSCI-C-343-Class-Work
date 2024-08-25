import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class SearchEngineTest {
    @Test
    public void test() throws IOException {
        SearchEngine s=new SearchEngine(3);
        assertEquals(s.search("the").toString(),"[https://en.wikipedia.org/wiki/Computer_Science, https://en.wikipedia.org/wiki/Machine_learning, https://en.wikipedia.org/wiki/Statistics, https://en.wikipedia.org/wiki/Computer_vision, https://en.wikipedia.org/wiki/Functional_programming, https://en.wikipedia.org/wiki/K-pop, https://en.wikipedia.org/wiki/Blackpink, https://en.wikipedia.org/wiki/BTS, https://en.wikipedia.org/wiki/Democratic_Party_(United_States), https://en.wikipedia.org/wiki/Republican_Party_(United_States), https://en.wikipedia.org/wiki/Taiwan, https://en.wikipedia.org/wiki/China, https://en.wikipedia.org/wiki/India, https://en.wikipedia.org/wiki/Canada, https://en.wikipedia.org/wiki/American_Civil_War, https://en.wikipedia.org/wiki/Chinese_Civil_War, https://en.wikipedia.org/wiki/French_Revolution, https://en.wikipedia.org/wiki/Google, https://en.wikipedia.org/wiki/Presidential_elections_in_Singapore, https://en.wikipedia.org/wiki/Black_hole, https://en.wikipedia.org/wiki/Red_Velvet_(group), https://en.wikipedia.org/wiki/Kendrick_Lamar, https://en.wikipedia.org/wiki/Daniel_P._Friedman, https://en.wikipedia.org/wiki/Linear_algebra, https://en.wikipedia.org/wiki/Graph_theory, https://en.wikipedia.org/wiki/Valorant, https://en.wikipedia.org/wiki/League_of_Legends, https://en.wikipedia.org/wiki/FIFA_World_Cup, https://en.wikipedia.org/wiki/Pickleball, https://en.wikipedia.org/wiki/National_Hockey_League, https://en.wikipedia.org/wiki/OpenAI, https://en.wikipedia.org/wiki/Competitive_eating, https://en.wikipedia.org/wiki/COVID-19, https://en.wikipedia.org/wiki/Naomi_Osaka, https://en.wikipedia.org/wiki/Serena_Williams, https://en.wikipedia.org/wiki/Kobe_Bryant, https://en.wikipedia.org/wiki/Ukraine, https://en.wikipedia.org/wiki/Animal_Crossing, https://en.wikipedia.org/wiki/Minecraft, https://en.wikipedia.org/wiki/Cloud_computing, https://en.wikipedia.org/wiki/Agile_software_development, https://en.wikipedia.org/wiki/Jeremy_Bentham, https://en.wikipedia.org/wiki/Feminism, https://en.wikipedia.org/wiki/McDonald%27s, https://en.wikipedia.org/wiki/Riot_Games, https://en.wikipedia.org/wiki/GitHub, https://en.wikipedia.org/wiki/Quantum_mechanics, https://en.wikipedia.org/wiki/Quantitative_fund, https://en.wikipedia.org/wiki/Quantum_computing, https://en.wikipedia.org/wiki/Pok%C3%A9mon, https://en.wikipedia.org/wiki/Norway_women%27s_national_football_team, https://en.wikipedia.org/wiki/Cat, https://en.wikipedia.org/wiki/Dog, https://en.wikipedia.org/wiki/Human_rights, https://en.wikipedia.org/wiki/Civil_rights_movement, https://en.wikipedia.org/wiki/Kamala_Harris, https://en.wikipedia.org/wiki/Mike_Pence, https://en.wikipedia.org/wiki/January_6_United_States_Capitol_attack, https://en.wikipedia.org/wiki/Assassination_attempts_on_Fidel_Castro, https://en.wikipedia.org/wiki/Nikola_Tesla, https://en.wikipedia.org/wiki/Naruto, https://en.wikipedia.org/wiki/Jujutsu_Kaisen, https://en.wikipedia.org/wiki/Bleach_(manga), https://en.wikipedia.org/wiki/Spy_%C3%97_Family, https://en.wikipedia.org/wiki/SZA, https://en.wikipedia.org/wiki/Beyonc%C3%A9, https://en.wikipedia.org/wiki/Indiana_University_Bloomington]");
        assertEquals(s.search("virus").toString(),"[https://en.wikipedia.org/wiki/China, https://en.wikipedia.org/wiki/COVID-19, https://en.wikipedia.org/wiki/Cat, https://en.wikipedia.org/wiki/Mike_Pence]");
        assertEquals(s.search("science").toString(),"[https://en.wikipedia.org/wiki/Computer_Science, https://en.wikipedia.org/wiki/Machine_learning, https://en.wikipedia.org/wiki/Statistics, https://en.wikipedia.org/wiki/Computer_vision, https://en.wikipedia.org/wiki/Functional_programming, https://en.wikipedia.org/wiki/K-pop, https://en.wikipedia.org/wiki/Democratic_Party_(United_States), https://en.wikipedia.org/wiki/Republican_Party_(United_States), https://en.wikipedia.org/wiki/Taiwan, https://en.wikipedia.org/wiki/China, https://en.wikipedia.org/wiki/India, https://en.wikipedia.org/wiki/Canada, https://en.wikipedia.org/wiki/American_Civil_War, https://en.wikipedia.org/wiki/Chinese_Civil_War, https://en.wikipedia.org/wiki/French_Revolution, https://en.wikipedia.org/wiki/Google, https://en.wikipedia.org/wiki/Black_hole, https://en.wikipedia.org/wiki/Daniel_P._Friedman, https://en.wikipedia.org/wiki/Linear_algebra, https://en.wikipedia.org/wiki/Graph_theory, https://en.wikipedia.org/wiki/League_of_Legends, https://en.wikipedia.org/wiki/OpenAI, https://en.wikipedia.org/wiki/COVID-19, https://en.wikipedia.org/wiki/Serena_Williams, https://en.wikipedia.org/wiki/Ukraine, https://en.wikipedia.org/wiki/Cloud_computing, https://en.wikipedia.org/wiki/Agile_software_development, https://en.wikipedia.org/wiki/Jeremy_Bentham, https://en.wikipedia.org/wiki/Feminism, https://en.wikipedia.org/wiki/McDonald%27s, https://en.wikipedia.org/wiki/Riot_Games, https://en.wikipedia.org/wiki/Quantum_mechanics, https://en.wikipedia.org/wiki/Quantum_computing, https://en.wikipedia.org/wiki/Cat, https://en.wikipedia.org/wiki/Dog, https://en.wikipedia.org/wiki/Human_rights, https://en.wikipedia.org/wiki/Civil_rights_movement, https://en.wikipedia.org/wiki/Kamala_Harris, https://en.wikipedia.org/wiki/Mike_Pence, https://en.wikipedia.org/wiki/January_6_United_States_Capitol_attack, https://en.wikipedia.org/wiki/Nikola_Tesla, https://en.wikipedia.org/wiki/Beyonc%C3%A9, https://en.wikipedia.org/wiki/Indiana_University_Bloomington]");
    }
}