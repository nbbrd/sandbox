/*
 * Copyright 2018 National Bank of Belgium
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 */
package be.nbb.rd.sandbox;

import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author Philippe Charles
 */
@CommandLine.Command(name = "hello")
public final class Main implements Callable<Void> {

    @CommandLine.Parameters(arity = "1")
    private String name;

    @Override
    public Void call() throws Exception {
        System.out.println("Hello " + name);
        return null;
    }

    public static void main(String[] args) {
        new CommandLine(new Main()).execute(args);
    }
}
