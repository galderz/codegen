package io.vertx.test.codegen.testoptions;

import io.vertx.codegen.annotations.Options;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@Options
public interface OptionsWithProperty {

  OptionsWithProperty setNonOptionsProperty(String value);

}
