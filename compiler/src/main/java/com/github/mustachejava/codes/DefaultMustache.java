package com.github.mustachejava.codes;

import java.io.IOException;
import java.io.Writer;

import com.github.mustachejava.Code;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheException;
import com.github.mustachejava.MustacheFactory;

/**
* Default Mustache
*/
public class DefaultMustache extends DefaultCode implements Mustache {
  public DefaultMustache(MustacheFactory cf, Code[] codes, String name, String sm, String em) {
    super(cf.getObjectHandler(), codes, name, null, sm, em);
  }

  @Override
  public void identity(Writer writer) {
    // No self output at the top level
    runIdentity(writer);
  }
}
