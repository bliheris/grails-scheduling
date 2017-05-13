package scheduling

import pl.mb.scheduling.Major
import pl.mb.scheduling.MajorSemester

class BootStrap {

    def init = { servletContext ->
        Major informatyka = new Major(name: 'Informatyka').save()
        Major mechanika = new Major(name: 'Mechanika').save()

        MajorSemester inf1 = new MajorSemester(major: informatyka, semester: 1).save()
        MajorSemester inf2 = new MajorSemester(major: informatyka, semester: 2).save()

        MajorSemester mech1 = new MajorSemester(major: mechanika, semester: 1).save()
    }
    def destroy = {
    }
}
