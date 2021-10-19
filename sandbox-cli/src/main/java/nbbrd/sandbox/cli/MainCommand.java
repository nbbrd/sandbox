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
package nbbrd.sandbox.cli;

import nbbrd.sandbox.About;
import nbbrd.sandbox.impl.SomeServiceImpl;
import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author Philippe Charles
 */
@CommandLine.Command(
        name = About.NAME,
        versionProvider = MainCommand.ManifestVersionProvider.class,
        scope = CommandLine.ScopeType.INHERIT,
        sortOptions = false,
        mixinStandardHelpOptions = true
)
public final class MainCommand implements Callable<Void> {

    public static void main(String[] args) {
        new CommandLine(new MainCommand()).execute(args);
    }

    @CommandLine.Parameters(arity = "1")
    private String name;

    @Override
    public Void call() {
        System.out.println(new SomeServiceImpl().formatText("Hello " + name));
        return null;
    }

    public static final class ManifestVersionProvider implements CommandLine.IVersionProvider {

        @Override
        public String[] getVersion() {
            return new String[]{
                    "@|bold " + About.NAME + " " + About.VERSION + "|@",
                    "JVM: ${java.version} (${java.vendor} ${java.vm.name} ${java.vm.version})",
                    "OS: ${os.name} ${os.version} ${os.arch}"
            };
        }
    }
}
