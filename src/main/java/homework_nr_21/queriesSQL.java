package homework_nr_21;

public enum queriesSQL {
    INSERT_NEW_STUDENT("inser into students(name,age,grage)values(?,?,?,?)"),
    UPDATE_GRADE_STUDENT("update studens set grade=? where id = ?"),
    DELETE_STUDENT("delete from students where id=?"),
    INFO_TABLE("select * from student");

    String query;

    queriesSQL(String query) {
        this.query = query;
    }



}
