public class StringOperations {
    public int stringLength(String text){
        return text.length();
    }
    public String stringConcatenation(String text1 , String text2){
        return text1.concat(text2);
    }
    public boolean stringContains(String tex1,String tex2){
        if(tex1.contains(tex2)){
            return true;
        }
        else{
            return false;
        }
    }
}
