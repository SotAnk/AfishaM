package ru.netology.manager;

import ru.netology.domain.Film;

public class FilmManager {
    private int countFilms = 10;
    private Film[] films = new Film[countFilms];


    public FilmManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
//        System.arraycopy(films, 0, tmp, 0, length - 1);
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }


        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] getFilms() {
        Film[] result = new Film[countFilms];
        int counter = 0;
        for (int i = 0; i < countFilms; i++) {
            int index = films.length - i - 1;
            result[counter] = films[index];
            counter++;

        }
        Film[] finalResult = new Film[counter];
        System.arraycopy(result, 0, finalResult, 0, counter);

        return finalResult;
    }
}
