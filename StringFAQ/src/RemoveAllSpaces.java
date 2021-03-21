public class RemoveAllSpaces {
	
    public static void main(String[] args) {
        String str = "Lakers     Champs      2020";
        
        //1st method
        
        String noSpaceStr = str.replaceAll("\\s", "");
        System.out.println(noSpaceStr);
        
        //2nd method
        
        char[] strArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);
    }
}