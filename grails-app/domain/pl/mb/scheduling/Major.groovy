package pl.mb.scheduling

class Major {

    String name

    static hasMany = [semesters: MajorSemester]

    String toString() {
        name
    }

    static constraints = {
    }
}
