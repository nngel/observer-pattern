# Observer Pattern

A design pattern used in software engineering to establish a one-to-many dependency between objects. In this pattern, when one object (the subject) changes its state, all its dependents (observers) are automatically notified and updated. This allows for efficient communication and synchronization between objects without them needing to know about each other's specific details.

## Real-time News Subscription Service

**Background:** You're tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency. <br>

**Scenario Description:** The system comprises two main components: NewsAgency and Subscriber.

- **NewsAgency:** Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available. <br>
- **Subscriber:** Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.<br> </ul>

## Requirements:

1. **Subscription Management:**
<ul>
- Users should be able to subscribe to the news service.
- Subscribers should be notified promptly when new news is published. </ul>

2. **Dynamic Subscription Updates:**
<ul>
- The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.
</ul>

3. **Decoupled Communication:**
<ul>
- Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available.  </ul>

# Expected Behavior:
- When the news agency publishes breaking news, all subscribed users should receive immediate updates.
- Subscribers can join or leave the service without affecting the delivery of news to other subscribers.
- The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.

## Constraints:
- The system should be scalable to handle a growing number of subscribers without compromising performance.
- Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.

## Implementation of Observer Pattern

<p align="center">
    <img src="image.png" alt="Centered Image" /><br>
</p>

## Unified Modeling Language (UML) Class Diagram

<p align="center">
    <img src="image-1.png" alt="Centered Image" /><br>
</p>