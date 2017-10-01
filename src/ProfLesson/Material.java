package ProfLesson;

public class Material {
    private final int id;
    private String text;
    private boolean finish = false;

    public Material(String text) {
        this.id = 123; //TODO прикрутить генератор
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
