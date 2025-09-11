import java.util.ArrayList;
import java.util.List;

public class A005 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        
        System.out.println(solution(skill, skill_trees));
    }

    public static int solution (String skill, String[] skill_trees){
        int answer = 0;

        List<Character> skillString = new ArrayList<>();
        for(int i = 0; i < skill.length(); i++){
            skillString.add(skill.charAt(i));
        }

        for(String str : skill_trees){
            String onlySkillString = "";

            for(char c : str.toCharArray()){
                if(skillString.contains(c)) onlySkillString = onlySkillString + c;
            }

            if(onlySkillString.equals(skill.substring(0, onlySkillString.length()))) answer++;
        }

        if(answer == 0) answer = -1;

        return answer;
    }
}
