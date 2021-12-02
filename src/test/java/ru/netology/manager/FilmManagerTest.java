package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    private Film first = new Film(1, "first");
    private Film second = new Film(2, "second");
    private Film third = new Film(3, "third");
    private Film fourth = new Film(4, "fourth");
    private Film fifth = new Film(5, "fifth");
    private Film sixth = new Film(6, "sixth");
    private Film seventh = new Film(7, "seventh");
    private Film eighth = new Film(8, "eighth");
    private Film ninth = new Film(9, "ninth");
    private Film tenth = new Film(10, "tenth");

    @Test
    public void get10Movies() {
        FilmManager manager = new FilmManager(10);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] actual = manager.getFilms();
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLessMovies() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] actual = manager.getFilms();
        Film[] expected = new Film[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getZeroMovies() {
        FilmManager manager = new FilmManager(0);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] actual = manager.getFilms();
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getMoreMovies() {
        FilmManager manager = new FilmManager(11);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] actual = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getNegativeMovies() {
        FilmManager manager = new FilmManager(-2);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] actual = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] expected = new Film[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertEquals(expected, actual);
    }

}