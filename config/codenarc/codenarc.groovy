ruleset {
    description 'Grails-CodeNarc Project RuleSet'

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/comments.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/convention.xml')
    ruleset('rulesets/design.xml')
    ruleset('rulesets/dry.xml')
    ruleset('rulesets/enhanced.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml')
    ruleset('rulesets/generic.xml')
    ruleset('rulesets/groovyism.xml')
    ruleset('rulesets/imports.xml')
    ruleset('rulesets/logging.xml')
    ruleset('rulesets/naming.xml')
    ruleset('rulesets/size.xml')
    ruleset('rulesets/security.xml')
    ruleset('rulesets/serialization.xml')
    ruleset('rulesets/unnecessary.xml'){
        'UnnecessaryReturnKeyword' {
            enabled = false
        }
    }
    ruleset('rulesets/unused.xml')

//    ruleset('rulesets/convention.xml')
//    ruleset('rulesets/design.xml')
//    ruleset('rulesets/dry.xml')
//    ruleset('rulesets/exceptions.xml')
//    ruleset('rulesets/formatting.xml')
//    ruleset('rulesets/generic.xml')
//    ruleset('rulesets/imports.xml')
//    ruleset('rulesets/naming.xml')
//    ruleset('rulesets/unnecessary.xml')
//    ruleset('rulesets/unused.xml')
//    ruleset('rulesets/grails.xml')
}