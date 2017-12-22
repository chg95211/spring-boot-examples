package alex.dto;

public class School {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column school.id
     *
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column school.name
     *
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column school.id
     *
     * @return the value of school.id
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column school.id
     *
     * @param id the value for school.id
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table school
     *
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    public School withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column school.name
     *
     * @return the value of school.name
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column school.name
     *
     * @param name the value for school.name
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table school
     *
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    public School withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table school
     *
     * @mbg.generated Fri Oct 06 09:41:17 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}