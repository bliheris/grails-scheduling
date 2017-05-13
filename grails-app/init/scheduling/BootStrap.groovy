package scheduling

import pl.mb.scheduling.Course
import pl.mb.scheduling.Major
import pl.mb.scheduling.MajorSemester
import pl.mb.scheduling.ScheduleEntry
import pl.mb.scheduling.StudentGroup

class BootStrap {

    def init = { servletContext ->
        Major informatyka = new Major(name: 'Informatyka').save()
        Major mechanika = new Major(name: 'Mechanika').save()

        MajorSemester inf1 = new MajorSemester(major: informatyka, semester: 1).save()
        MajorSemester inf2 = new MajorSemester(major: informatyka, semester: 2).save()

        MajorSemester mech1 = new MajorSemester(major: mechanika, semester: 1).save()

        Course oop = new Course(
                majorSemester: inf1, name: 'Wstęp do programowania obiektowego').save()
        Course func = new Course(
                majorSemester: inf1, name: 'Wstęp do programowania funkcyjnego').save()

        StudentGroup inf11 = new StudentGroup(majorSemester: inf1, number: 1).save()
        StudentGroup inf12 = new StudentGroup(majorSemester: inf1, number: 2).save()

        ScheduleEntry se1 = new ScheduleEntry(
                course: oop, studentGroup: inf11, type: 'Lecture', day: 'Pn',
                startHour: '10:00', endHour: '11:00'

        ).save(failOnError: true)
    }
    def destroy = {
    }
}
