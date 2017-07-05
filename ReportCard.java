public class ReportCard
{
        private String nameStudent,idStudent,grade;
        private int dbmsMarks,deldMarks,osMarks,cppMarks,totalMarks=0;
        private final percentage=0;
        public ReportCard(String student_Name,String student_Id,int dbms_Marks,int deld_Marks,int os_Marks,int cpp_Marks)
        {
                this.nameStudent=student_Name;
                this.idStudent=student_Id;
                this.dbmsMarks=dbms_Marks;
                this.deldMarks=deld_Marks;
                this.osMarks=os_Marks;
                this.cppMarks=cpp_Marks;
        }
        public String getnameStudent()
        {
            return nameStudent;
        }
        public String getidStudent()
        {
        return idStudent;
        }
        public int getdbmsMarks()
        {
            return dbmsMarks;
        }
        public int getdeldMarks()
        {
            return deldMarks;
        }
        public int getosMarks()
        {
            return osMarks;
        }
        public int getcppMarks()
        {
            return cppMarks;
        }
        public void setnameStudent(String student_Name)
        {
            this.nameStudent=student_Name;
        }
        public void setidStudent(String student_Id)
        {
            this.idStudent=student_Id;
        }
        public void setdeldMarks(int deld_Marks)
        {
            this.deldMarks=deld_Marks;
        }
        public void setdbmsMarks(int dbms_Marks)
        {
            this.dbmsMarks=dbms_Marks;
        }
        public void setosMarks(int os_Marks)
        {
            this.osMarks=os_Marks;
        }
        public void setcppMarks(int cpp_Marks)
        {
            this.cppMarks=cpp_Marks;
        }
        private String displayStudentResult(int deld,int dbms,int os,int cpp)
        {
            totalMarks = deld+dbms+os+cpp;
            percentage = (totalMarks/400)*100;
            if(percentage>=95)
            {
                grade="A+";
            }
            else if(percentage>=90)
            {
                grade="A";
            }
            else if(percentage>=80)
            {
                grade="B+";
            }
            else if(percentage>=70)
            {
                grade="B";
            }
            else if(percentage>=60)
            {
                grade="C+";
            }
            else if(percentage>=50)
            {
                grade="C";
            }
            else if(percentage>=40)
            {
                grade="D";
            }
            else
            {
                grade="Fail";
            }
            return grade;
        }
        @Override
        public String toString()
        {
            return "Report Card-->"+"\n"+"Student Name - "+nameStudent+"\n"+"Student ID - "+idStudent+"\n"+
            "Marks in subjects :"+"\n"+"Deld Marks :"+deldMarks+"\n"+"Dbms Marks :"+dbmsMarks+"\n"+"Os Marks :"+osMarks+"\n"+"Cpp Marks :"+cppMarks+
            "\n"+"Overall Grade : "+displayStudentResult(getdbmsMarks,getdeldMarks,getosMarks,getcppMarks);
        }
}
