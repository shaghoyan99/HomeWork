package work.company.models;

import java.util.Objects;

public class Company {

    private String name;
    private String idCompany;

    public Company(String name, String idCompany) {
        this.name = name;
        this.idCompany = idCompany;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(idCompany, company.idCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idCompany);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", idCompany='" + idCompany + '\'' +
                '}';
    }
}
