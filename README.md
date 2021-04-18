# SfAllure

An Allure plugin to generate nice Allure reports for Salesforce Apex test results.

## Requirements

1. [Allure](https://docs.qameta.io/allure/)

## Installation

1. Download the latest version form [relases](/nchursin/salesforce-allure-plugin/releases)
1. Upzip it and put into `allure/**/plugins`
1. Go to `allure/**/config/allure.yml` and add the following line to `plugins`:
```yaml
plugins:
 - sfallure
...
```

## SFDX plugin

There's an [SFDX plugin](https://github.com/nchursin/sfcraft-sfdx-allure) to make it easier for you to use this Allure plugin.