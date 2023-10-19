package student;

/**
 * Класс, описывающий студента
 * Для работы с объектами студентов предусмотрен {@link StudentService}
 *
 * @author Andrey Pomelov
 * @version 2.0.0
 */
public class Student {

    /**
     * Идентификатор студента
     */
    private int id;

    /**
     * Имя студента
     */
    private String name;

    /**
     * Средний балл студента
     */
    private double averageRate;

    /**
     * Конструктор для создания объекта студента
     *
     * @param id            идентификатор студента
     * @param name          имя студента
     * @param averageRate   средний балл студента
     * @see                 Student#Student(int, String)
     * @since               1.0.0
     * @deprecated          при поступлении у студента ещё нет среднего балла
     */
    public Student(int id, String name, double averageRate) {
        this.id = id;
        this.name = name;
        this.averageRate = averageRate;
    }

    /**
     * Конструктор для создания объекта студента
     *
     * @param id            идентификатор студента
     * @param name          имя студента
     * @see                 Student#Student(int, String, double)
     * @since               2.0.0
     */
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Геттер
     *
     * @return  идентификатор студента
     * @see     Student#id
     */
    public int getId() {
        return id;
    }

    /**
     * Метод для преобразования объекта студента в строку
     *
     * @return строковое описание объекта студента
     */
    @Override
    public String toString() {
        return String.format("Студент: ИД - %d, имя - %s, средний балл - %.2f",
                id, name, averageRate);
    }
}