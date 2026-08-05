package Task_Interview.Interview.interviewAprilRevision;

class MainAnimal{
    public static void main(String[] args){

        Dog dog = new Dog("Buddy","Golden Retriver");
        dog.sound();
    }
}

class Animal {
    String name;

    Animal (String name){
        this.name = name;
        System.out.println("Animal is called: " +name );
    }

    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed){
        super(name);
        this.breed = breed;
        System.out.println(name+" belongs to breed: "+ breed);
    }
    void sound(){
        System.out.println(name +" :Barks");
    }

}


