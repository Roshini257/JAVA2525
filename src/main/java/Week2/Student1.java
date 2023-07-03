package src.main.java.Week2;



    public class Student1 implements Comparable<Student1>{

        String fn;
        String ln;
        int gpa;

        public Student1(String fn, String ln, int gpa) {
            this.fn = fn;
            this.ln = ln;
            this.gpa = gpa;
        }


        @Override
        public int compareTo(Student1 s) {
            return (this.ln).compareTo(s.ln);
        }

        @Override
        public String toString() {
            return this.fn+"  " +this.ln+"  " +this.gpa;
        }
    }


