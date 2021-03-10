package Company;
//  Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal
{
    public Cat(float maxRunLength, float maxJumpHeight)
    {
        super(maxRunLength, 0, maxJumpHeight);
    }

    @Override
    public void swim(float length)
    {
        System.out.println("Cats can't swim!");
    }
}