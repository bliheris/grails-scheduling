package pl.mb.scheduling

class ScheduleEntry {

    Course course
    String type
    String day
    String startHour
    String endHour

    static belongsTo = [studentGroup: StudentGroup]

    String toString() {
        "$day ${startHour}-${endHour} ${course?.name}"
    }

    static constraints = {
        course nullable: false
        type inList: ['Lecture', 'Tutorial', 'Labs']
        day inList: ['Pn', 'Wt', 'Śr', 'Czw', 'Pt']
        startHour nullable: false
        endHour nullable: false
    }
}
