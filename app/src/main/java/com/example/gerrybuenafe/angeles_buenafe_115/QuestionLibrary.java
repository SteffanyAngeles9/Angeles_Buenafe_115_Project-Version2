package com.example.gerrybuenafe.angeles_buenafe_115;

public class QuestionLibrary {

    private String mQuestion [] = {
                "It is a natural event or occurrence where a piece of land (or area) that is usually dry land, suddenly gets submerged under water",
                "This type of flood is usually a result of water bodies over flooding their banks. They tend to develop slowly and can last for days and weeks",
                "This type of flood takes slightly longer to develop and the flood can last for a day or two only",
                "This type of flood occurs within a very short time and is usually as a result of heavy rain, dam break or snow melt",
                "The following are needed in a disaster supply, except",
                "The following are the causes of flood, except",
                "During floods, roads, bridges, farms, houses and automobiles are destroyed. People become homeless. Additionally, the government deploys firemen, police and other emergency apparatuses to help the affected",
                "The following are included in a first aid kit, except",
                "The following are included in a first aid kit, except",
                "The following are included in a first aid kit, except",
                "Switch off electrical and gas appliances, and turn off services off at the mains",
                "Carry what you want to carry and not an emergency kit and don't let your friends and family know where you are going",
                "If you have to walk in standing water, use a pole or stick to ensure that you do not step into deep water, open manholes or ditches",
                "Stay away from power lines electrical current can travel through water, Report power lines that are down to the power company",
                "You should drive through a flooded area even if you get stranded",
                "Stay away from power lines and electrical wires",
                "Allow children to play around high water, storm drains, creeks, or rivers",
                "Throw away medicine, food, or water that had contact with floodwaters (including canned goods)",
                "Check for gas leaks. If you smell gas or hear a blowing or hissing noise, open a window and quickly leave the building. If possible turn off the gas at the outside main valve. Call the gas company",
                "Use TV or any other appliances right after the flood even if the outlet is wet"

    };

    private String mChoices [][] = {
            {"Hurricane","Flood", "Tsunami"},
            {"Rapid on-set","Slow on-set","Flash flood"},
            {"Flash flood","Rapid on-set"," Slow on-set"},
            {"Slow on-set","Flash flood","Rapid on-set"},
            {"Toys","Water","Flashlight"},
            {"Heavy Rain","Clogged Drainage","Volcanic Eruption"},
            {"Economic","People and Animals","Environment"},
            {"Scissors","Plasters","Cellphone"},
            {"Sticky Tape","Umbrella","Antibiotic Ointment"},
            {"Radio","Cash","Bicycle"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},
            {"True","False","Somewhat true"},

    };

    private String mAnswer[] = {"Flood", "Slow on-set", "Rapid on-set", "Flash flood", "Toys", "Volcanic Eruption", "Economic", "Cellphone", "Umbrella", "Bicycle", "True", "False", "True", "True", "False", "True", "False", "True", "True", "False"};

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer = mAnswer[a];
        return answer;
    }


}
