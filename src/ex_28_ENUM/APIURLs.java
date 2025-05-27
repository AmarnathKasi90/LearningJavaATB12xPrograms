package ex_28_ENUM;

public enum APIURLs {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIURLs(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }

    public static void main(String[] args) {
        for (APIURLs api : APIURLs.values()){
            System.out.println(api.name() +" => " + api.getUrl());
        }
        System.out.println("google url: " + APIURLs.google.getUrl());
    }

}