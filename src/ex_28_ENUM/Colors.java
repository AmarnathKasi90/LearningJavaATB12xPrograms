package ex_28_ENUM;


public enum Colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    Colors(String hexCode){
        this.hexCode = hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }

    public static void main(String[] args) {
        for(Colors color: Colors.values()){
            System.out.println(color.name() +" : " +color.getHexCode());
        }
    }
}