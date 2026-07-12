public  class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", species='" + getSpecies() + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}