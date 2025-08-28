public class P25083 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1 >> 20);

        sb.append("         ,r'\"7").append('\n')
        .append("r`-_   ,'  ,/").append('\n')
        .append(" \\. \". L_r'").append('\n')
        .append("   `~\\/").append('\n')
        .append("      |").append('\n')
        .append("      |");

        System.out.println(sb.toString());
    }
}