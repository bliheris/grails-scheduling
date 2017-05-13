package pl.mb.scheduling

class StudentGroup {

    int number = 1

    static belongsTo = [majorSemester: MajorSemester]

    static constraints = {
    }
}
