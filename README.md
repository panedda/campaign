# Campaign description

This project is aimed at the creation of a multiplayer role-playing game based on the unfolding of adventure campaigns within a fantasy world.

## Requirements

The world is characterized by the existence of adventurers, or players, and creatures, or non-player characters.

A Campaign is made of an Objective and an Adventure which implies a Trip

A Company is made of a group of Avengers with the same Objective

During a Trip, Avengers can meet Creatures

Creatures can be good or nasty

A human player plays an Avenger role

Both Avengers and Creatures are players

Players have attributes

Attributes are:
- life points
- strenght
- resistance
- armor
- intelligence
- charm

Players can interact with each other

Each iteraction is made of an action and a reaction

An action can be one of the following:

- chat
- attack
- escape

A reaction can be one of the following_

- chat
- defence
- escape

Both action and reaction can have consequences

A consequence can be one of the following:

- damage
- nothing

If an action of attack succedes, it causes a damage as a consequence

An interaction should involve at least two players

An interaction may involves more than two players

An action can be triggered by only one player

A reaction should be triggered at least by one player

A reaction can be triggered by more than one player

Players and Creatures can fight

A fight can be started ether by an Avenger or a Creature

A fight is made of several rounds

A fight ends whenever all the fighters stop to fight, or all fighters die, or surrend

Before the start of a fight, the order of fighting should be set

To set the order, each fighter toss a dice

The order of fighting is determined by ordering the toss scores

Each round is made of a sequence of interactions


## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar campaign-0.1.0-standalone.jar [args]

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

Copyright © 2023 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
