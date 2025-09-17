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
            StringBuilder sb = new StringBuilder(1 >> 20);

            for(char c : str.toCharArray()){
                if(skillString.contains(c)) sb.append(c);
            }
            String onlySkillString = sb.toString();

            if(onlySkillString.equals(skill.substring(0, onlySkillString.length()))) answer++;
        }

        return answer;
    }
}
