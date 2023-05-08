package students.model;

import students.model.faculty;
import students.model.YearOfBirth;
import knigi.model.Publisher;

import java.time.LocalDate;
import java.util.Arrays;


    public final class Student {
        private final int id;
        private final String name;
        private final String surname;
        private final String lastname;

        private final String[] adress;
        private final int number;
        private final LocalDate yearOfBirth;
        private final String faculty;
        private final int course;

        private final String group;

        private static int innerId;

        public Student(String name, String surname, String lastname, String[] adress,  String faculty, LocalDate yearOfBirth,
                    int course, int number, String group) {
            this.id = innerId++;
            this.name = name;
            this.surname = surname;
            this.lastname = lastname;
            this.yearOfBirth = yearOfBirth;
            this.adress = adress;
            this.faculty = faculty;
            this.course = course;
            this.number = number;
            this.group = group;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
        public String getLastname() {
            return lastname;
        }
        public String[] getAdress() {
            return adress;
        }

        public String getFaculty() {
            return faculty;
        }

        public LocalDate getYearOfBirth() {
            return yearOfBirth;
        }

        public int getNumber() {
            return number;
        }

        public int getCourse() {
            return course;
        }

        public String getGroup() {
            return group;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "surname='" + surname +
                    "name='" + name + '\''+
                    "lastname='" + lastname +
                    ", yearOfBirth=" + yearOfBirth +
                    ", adress =" + Arrays.toString(adress) +
                    ", number =" + number +

                    ", faculty=" + faculty+
                    ", group=" + group +
                    ", coure =" + course +
                    '}';
        }
    }


