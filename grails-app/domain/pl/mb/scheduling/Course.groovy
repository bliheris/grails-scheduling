package pl.mb.scheduling

class Course {

    String name

    int lectures = 0
    int tutorials = 0
    int labs = 0

    static belongsTo = [majorSemester: MajorSemester]

    String toString() {
        name
    }

    static constraints = {
        majorSemester nullable: false
        name blank: false
        lectures min: 0
        tutorials min: 0
        labs min: 0
    }
}
