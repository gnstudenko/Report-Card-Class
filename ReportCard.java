package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by george on 18/04/2017.
 */

public class ReportCard {
    final private String mStudentName;
    final private int mYear;
    final private int mGrade;
    private ArrayList<Integer> mReadingGrades;
    private ArrayList<Integer> mMathematicsGrades;
    private ArrayList<Integer> mScienceGrades;
    private ArrayList<Integer> mArtGrades;
    private ArrayList<Integer> mMusicGrades;
    private ArrayList<Integer> mAttendancePresent;
    private ArrayList<Integer> mAttendanceAbsent;
    private ArrayList<Integer> mAttendanceTardy;

    public ReportCard (String studentName, int grade, int year){
        mStudentName = studentName;
        mYear = year;
        mGrade = grade;
    }

    public ReportCard (String studentName, int grade, int year, ArrayList<Integer> readingGrades,
                       ArrayList<Integer> mathematicsGrades, ArrayList<Integer> scienceGrades,
                       ArrayList<Integer> artGrades, ArrayList<Integer> musicGrades,
                       ArrayList<Integer> attendancePresent, ArrayList<Integer> attendanceAbsent,
                       ArrayList<Integer> attendanceTardy){
        mStudentName = studentName;
        mYear = year;
        mGrade = grade;
        mReadingGrades = readingGrades;
        mMathematicsGrades = mathematicsGrades;
        mScienceGrades = scienceGrades;
        mArtGrades = artGrades;
        mMusicGrades = musicGrades;
        mAttendanceAbsent = attendanceAbsent;
        mAttendancePresent = attendancePresent;
        mAttendanceTardy = attendanceTardy;
    }

    public String getStudentName(){
        return mStudentName;
    }

    public int getYear(){
        return mYear;
    }

    public int getGrade(){
        return mGrade;
    }

    /**
     * Sets reading grades for all 4 periods
     * @param grades containing grades for all 4 periods
     */
    public void setReadingGrades(ArrayList<Integer> grades){
        mReadingGrades=grades;
    }

    /**
     * Sets reading grade for one period
     * @param period the period of the grade
     * @param grade the grade
     */
    public void setReadingGrades(int period, int grade){
        mReadingGrades.add(period--,grade);
    }

    /**
     *
     * @return Reading grades for all periods
     */
    public String getReadingGrades(){
        String output = "Reading: \t";
        for(int i=0; i<mReadingGrades.size(); i++){
            output= output + "\t"+mReadingGrades.get(i);
        }
        return output;
    }

    /**
     * Sets Mathematics grades for all 4 periods
     * @param grades containing grades for all 4 periods
     */
    public void setMathematicsGrades(ArrayList<Integer> grades){
        mMathematicsGrades=grades;
    }

    /**
     * Sets Mathematics grade for one period
     * @param period the period of the grade
     * @param grade the grade
     */
    public void setMathematicsGrades(int period, int grade){
        mMathematicsGrades.add(period--,grade);
    }

    /**
     *
     * @return Mathematics grades for all periods
     */
    public String getMathematicsGrades(){
        String output = "Mathematics: ";
        for(int i=0; i<mMathematicsGrades.size(); i++){
            output= output + "\t"+mMathematicsGrades.get(i);
        }
        return output;
    }

    /**
     * Sets Science grades for all 4 periods
     * @param grades containing grades for all 4 periods
     */
    public void setScienceGrades(ArrayList<Integer> grades){
        mScienceGrades=grades;
    }

    /**
     * Sets Science grade for one period
     * @param period the period of the grade
     * @param grade the grade
     */
    public void setScienceGrades(int period, int grade){
        mScienceGrades.add(period--,grade);
    }

    public ArrayList<Integer> getReadingGrades() {
        return mReadingGrades;
    }

    public ArrayList<Integer> getMathematicsGrades() {
        return mMathematicsGrades;
    }

    public ArrayList<Integer> getScienceGrades() {
        return mScienceGrades;
    }

    public ArrayList<Integer> getArtGrades() {
        return mArtGrades;
    }

    public ArrayList<Integer> getMusicGrades() {
        return mMusicGrades;
    }

    public ArrayList<Integer> getAttendancePresent() {
        return mAttendancePresent;
    }

    public ArrayList<Integer> getAttendanceAbsent() {
        return mAttendanceAbsent;
    }

    public ArrayList<Integer> getAttendanceTardy() {
        return mAttendanceTardy;
    }

    /**
     *
     * @return Science grades for all periods
     */
    public String getScienceGrades(){
        String output = "Science: \t";
        for(int i=0; i<mScienceGrades.size(); i++){
            output= output + "\t"+mScienceGrades.get(i);
        }
        return output;

    }

    // ART

    /**
     * Sets Art grades for all 4 periods
     * @param grades containing grades for all 4 periods
     */
    public void setArtGrades(ArrayList<Integer> grades){
        mArtGrades=grades;
    }

    /**
     * Sets Art grade for one period
     * @param period the period of the grade
     * @param grade the grade
     */
    public void setArtGrades(int period, int grade){
        mArtGrades.add(period--,grade);
    }

    /**
     *
     * @return Art grades for all periods
     */
    public String getArtGrades(){
        String output = "Art: \t\t";
        for(int i=0; i<mArtGrades.size(); i++){
            output= output + "\t"+mArtGrades.get(i);
        }
        return output;
    }

    // MUSIC

    /**
     * Sets Music grades for all 4 periods
     * @param grades containing grades for all 4 periods
     */
    public void setMusicGrades(ArrayList<Integer> grades){
        mMusicGrades=grades;
    }

    /**
     * Sets Music grade for one period
     * @param period the period of the grade
     * @param grade the grade
     */
    public void setMusicGrades(int period, int grade){
        mMusicGrades.add(period--,grade);
    }

    /**
     *
     * @return Music grades for all periods
     */
    public String getMusicGrades(){
        String output = "Music: \t\t";
        for(int i=0; i<mMusicGrades.size(); i++){
            output= output + "\t"+mMusicGrades.get(i);
        }
        return output;
    }

    /**
     * Prints the Report Card with a nice human readable format
     * @return Report Card
     */
    @Override
    public String toString() {
        String output="Student: " + getStudentName() +
                "\nGrade: " + getGrade() +
                "\nYear: " + getYear() +
                "\nPeriods: " + "\t\tP1\tP2\tP3\tP4" +
                "\n\n"+getReadingGrades() +
                "\n"+getMathematicsGrades()+
        "\n"+getScienceGrades() +
                "\n"+getArtGrades() +
        "\n"+getMusicGrades();

        return output;
    }
}
