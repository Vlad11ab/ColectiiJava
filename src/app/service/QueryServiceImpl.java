package app.service;

import app.RepositoryMapExample;
import app.RepositoryMapExampleSingleton;
import app.car.model.Car;
import app.users.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class QueryServiceImpl implements QueryService{

    RepositoryMapExample repositoryMapExample;

    QueryServiceImpl() {
        this.repositoryMapExample = RepositoryMapExampleSingleton.getINSTANCE();
    }


}
