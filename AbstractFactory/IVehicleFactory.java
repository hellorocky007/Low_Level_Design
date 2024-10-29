package AbstractFactory;

import AbstractFactory.Models.IEngine;

public interface IVehicleFactory {
    public IEngine createEngine();
}
