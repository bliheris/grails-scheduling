package pl.mb.scheduling

class MajorSemester {

    int semester = 1

    static belongsTo = [major: Major]

    static hasMany = [courses: Course]

    String toString() {
        "${major} semester ${semester}"
    }

    static constraints = {
    }
}
