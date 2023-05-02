package by.alishev.lessons.lesson48;

public enum EAnimal {
    DOG("собака"),CAT("кот"),FROG("лягушка");

    private String translation;
    EAnimal(String translation) {
    this.translation=translation;
    }
    public String getTranslation(){
        return translation;
    }

    @Override
    public String toString() {
        return "EAnimal{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
