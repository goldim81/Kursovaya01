package ProfLesson;

import java.util.Set;

public class Theme {
    private final int id;
    private String name;
    private Set<Material> materials;

    public Theme() {
        this.id = 123; //TODO прикрутить генератор
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Material> materials) {
        this.materials = materials;
    }

    public void addMaterial(Material material) {
            this.materials.add(material);
    }
}
