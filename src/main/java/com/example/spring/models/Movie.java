package com.example.spring.models;

public class Movie {
        private int year;
        private int length;
        private String title;
        private String subject;
        private int popularity;
        private boolean awards;

        public Movie(int year, int length, String title, String subject, int popularity, String awards) {
            this.year = year;
            this.length = length;
            this.title = title;
            this.subject = subject;
            this.popularity = popularity;
            if (awards.equals("Yes")){
                this.awards = true;
            } else if(awards.equals("No")){
                this.awards = false;
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getPopularity() {
            return popularity;
        }

        public void setPopularity(int popularity) {
            this.popularity = popularity;
        }

        public boolean isAwards() {
            return awards;
        }

        public void setAwards(boolean awards) {
            this.awards = awards;
        }

        public int comparePopularity(Movie movie1, Movie movie2) {
            if (movie1.getPopularity() < movie2.getPopularity()){
                return -1;
            } else if (movie1.getPopularity() > movie2.getPopularity()){
                return 1;
            } else {
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Title: "+ getTitle() + " Subject: " + getSubject() + " Length: " + getLength() + " Year: " + getYear() + " Popularity: " + getPopularity() + " Has it an award wining movie? " + isAwards() + "\n";

        }
}
