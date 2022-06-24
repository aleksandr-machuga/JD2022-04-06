package by.it.kameisha.calc.entity;

import by.it.kameisha.calc.ResMan;
import by.it.kameisha.calc.constants.Errors;
import by.it.kameisha.calc.exception.CalcException;
import by.it.kameisha.calc.interfaces.Operation;

public abstract class Var implements Operation {
    private ResMan resMan= ResMan.INSTANCE;
    @Override
    public String toString() {
        return "abstract Var{}";
    }

    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException(resMan.get(Errors.INCORRECT_OPERATION)+" %s + %s%n", this, other);
    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException(resMan.get(Errors.INCORRECT_OPERATION)+" %s + %s%n", this, other);

    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException(resMan.get(Errors.INCORRECT_OPERATION)+" %s + %s%n", this, other);

    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException(resMan.get(Errors.INCORRECT_OPERATION)+" %s + %s%n", this, other);
    }
}
