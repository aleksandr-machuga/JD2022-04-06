package by.it.smirnov.calc.report;

abstract class Builder {





    public Report createReport() {

        return new Report();
    }

    public Builder() {

    }

    abstract void fillReport();

}
