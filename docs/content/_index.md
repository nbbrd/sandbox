---
title: "Overview"
---

This is a proof-of-concept of a documentation generated by [gohugo](https://gohugo.io/).

![](Duke_(Java_mascot)_waving.svg)

{{< toc >}}

## Dependency graph

```mermaid
flowchart BT

    x-jaxb{{javax.xml.bind:jaxb-api}}
    x-picocsv{{com.github.nbbrd.picocsv:picocsv}}

    base
    xml
    xml-bind
    picocsv
    win

    xml --> base
    xml-bind --> xml
    xml-bind -.-> x-jaxb
    win --> base
    picocsv --> base
    picocsv -.-> x-picocsv

    classDef x fill:#00000000,stroke:#00000000,font-style:italic
    class x-jaxb,x-picocsv x
```

## Some CSV content

{{< dependencies >}}

