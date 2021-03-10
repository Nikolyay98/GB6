package Company;
public abstract class Animal
{
    // У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
    protected float maxRunLength;
    protected float maxSwimLength;
    protected float maxJumpHeight;

    public Animal(float maxRunLength, float maxSwimLength, float maxJumpHeight)
    {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpHeight = maxJumpHeight;
    }
    // При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)

    public void run(float length)
    {
        System.out.println("run: " + isAvailableAction(length, maxRunLength));
    }

    public void swim(float length)
    {
        System.out.println("swim: " + isAvailableAction(length, maxSwimLength));
    }

    public void jump(float height)
    {
        System.out.println("jump: " + isAvailableAction(height, maxJumpHeight));
    }

    private boolean isAvailableAction(float required, float expected)
    {
        return required <= expected;
    }
}