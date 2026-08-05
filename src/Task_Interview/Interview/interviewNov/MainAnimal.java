package Task_Interview.Interview.interviewNov;

class Animal{
    String name;

    Animal(String name){
        this.name = name;
        System.out.println("Animal is called as:" + name);
    }

    void sound() {
        System.out.println(name + "makes sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed){
        super(name);
        this.breed = breed;
        System.out.println(name + " belongs to the breed " + breed);
    }
    void sound(){
        System.out.println(name+ ":Barks");
    }
}

class MainAnimal {
    public static void main(String[] args){
        Dog dog = new Dog("Buddy","Golden Retriever");
        dog.sound();
    }
}
