package pl.mb.scheduling

class StudentGroup {

    int number = 1

    static belongsTo = [majorSemester: MajorSemester]

    static hasMany = [schedule: ScheduleEntry]

    String toString() {
        "${majorSemester.major.name} sem. ${majorSemester.semester} - grupa ${number}"
    }

    static constraints = {
    }
}
