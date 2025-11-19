package app.service;

import app.RepositoryMapExample;
import app.RepositoryMapExampleSingleton;
import app.car.model.Car;
import app.users.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class CommandServiceImpl implements CommandService{

    RepositoryMapExample repositoryMapExample;

    CommandServiceImpl(){
        this.repositoryMapExample = RepositoryMapExampleSingleton.getINSTANCE();
    }



}
